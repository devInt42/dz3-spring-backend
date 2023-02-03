package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.DepartmentDto;
import com.example.backend.service.DepartmentServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentApiController {
	@Autowired
	private DepartmentServiceImpl departmentService;

	@GetMapping("/list")
	public List<DepartmentDto> getDepartmentList(@RequestParam("departmentDepth") String departmentDepth,
			@RequestParam("departmentParent") String departmentParent, DepartmentDto dto) {
		dto.setDepartmentDepth(Integer.parseInt(departmentDepth));
		dto.setDepartmentParent(Integer.parseInt(departmentParent));
		return departmentService.GetDepartmentList(dto);
	}

	@GetMapping("/count")
	public int getDepartmentCount(@RequestParam("departmentDepth") String departmentDepth,
			@RequestParam("departmentParent") String departmentParent, DepartmentDto dto) {
		dto.setDepartmentDepth(Integer.parseInt(departmentDepth));
		dto.setDepartmentParent(Integer.parseInt(departmentParent));
		if (departmentService.GetDepartmentCount(dto) == null) {
			return 0;
		}
		return departmentService.GetDepartmentCount(dto);
	}

	@GetMapping("/list/company/{companySeq}")
	public List<DepartmentDto> getCompanyList(@PathVariable("companySeq") int companySeq) {
		return departmentService.GetCompanyList(companySeq);
	}

	@GetMapping("/list/workplace")
	public List<DepartmentDto> getWorkplaceList() {
		return departmentService.GetWorkplaceList();
	}

	@GetMapping("/list/{departmentSeq}")
	public List<DepartmentDto> getDepartment(@PathVariable("departmentSeq") int departmentSeq) {
		return departmentService.GetDepartment(departmentSeq);
	}

	@GetMapping("/list/name")
	public List<DepartmentDto> getCompanyWorkplaceName(@RequestParam("companySeq") int companySeq,
			@RequestParam("workplaceSeq") int workplaceSeq, DepartmentDto dto) {
		dto.setCompanySeq(companySeq);
		dto.setWorkplaceSeq(workplaceSeq);
		return departmentService.GetCompanyWorkplaceName(dto);
	}

	@GetMapping("/workplace/{workplaceSeq}")
	public List<DepartmentDto> GetWorkplaceData(@PathVariable("workplaceSeq") int workplaceSeq) {
		return departmentService.GetWorkplaceData(workplaceSeq);
	}

	@GetMapping("/departmentparent/{workplaceSeq}")
	public List<DepartmentDto> GetDepartmentParent(@PathVariable("workplaceSeq") int workplaceSeq) {
		return departmentService.GetDepartmentParent(workplaceSeq);
	}

	@GetMapping("/info/check/")
	public int DupliCheck(@RequestParam("departmentCode") int departmentCode,
			@RequestParam("companySeq") int companySeq, DepartmentDto dto) {
		if (departmentCode == 0) {
			return 1;
		}
		dto.setDepartmentCode(departmentCode);
		dto.setCompanySeq(companySeq);
		return departmentService.DupliCheck(dto);
	}

	@GetMapping("/info/namecheck")
	public int NameDupliCheck(@RequestParam("workplaceSeq") int workplaceSeq,
			@RequestParam("departmentName") String departmentName, DepartmentDto dto) {
		if (departmentName == "" || departmentName == null) {
			return 2;
		}
		dto.setWorkplaceSeq(workplaceSeq);
		dto.setDepartmentName(departmentName);
		System.out.println(dto);
		return departmentService.NameDupliCheck(dto);
	}

	@PostMapping("/insert")
	public void InsertDepartment(@RequestBody DepartmentDto dto,
			@RequestParam("departmentParentDepth") int departmentParentDepth) {
		if (dto.getUseYN() == null || dto.getUseYN() == "") {
			dto.setUseYN("N");
		}
		if (dto.getDepartmentParent() == 0) {
			dto.setDepartmentDepth(0);
		} else {
			dto.setDepartmentDepth(departmentParentDepth + 1);
		}
		departmentService.InsertDepartment(dto);
	}

	@PostMapping("/update/{seq}")
	public void UpdateDepartment(@RequestBody DepartmentDto dto, @PathVariable("seq") int seq,
			@RequestParam("departmentParentDepth") int departmentParentDepth) {

		if (dto.getDepartmentParent() == 0) {
			dto.setDepartmentDepth(0);
		} else {
			dto.setDepartmentDepth(departmentParentDepth + 1);
		}
		dto.setDepartmentSeq(seq);
		departmentService.UpdateDepartment(dto);
	}

	@GetMapping("/delete/{seq}")
	public void DeleteDepartment(@PathVariable("seq") int seq) {
		departmentService.DeleteDepartment(seq);
	}

	@GetMapping("/find")
	public List<DepartmentDto> FindDepartment(@RequestParam(required = false, name = "searchName") String searchName,
			@RequestParam(required = false, name = "searchCompanySeq") String searchCompanySeq, DepartmentDto dto) {
		if( searchCompanySeq != null && Integer.parseInt(searchCompanySeq) > 0) {
			dto.setCompanySeq(Integer.parseInt(searchCompanySeq));
		}
		if(searchName == null) searchName = "";
		dto.setDepartmentName(searchName);
		System.out.println(searchName);
		System.out.println(dto);
		return departmentService.FindDepartment(dto);
	}
}
