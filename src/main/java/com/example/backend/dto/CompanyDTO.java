package com.example.backend.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
public class CompanyDTO {
	private int companySeq; //회사 기본키
	private int companyCode; // 회사 코드(사용자에게 보여주는 코드)
	private String companyName; //회사명
	private String companyBusiness; //회사 업태
	private String companyItem; // 종목
	private String companyCall; //연락처
	private String companyRegist; //사업자 등록번호
	private String companyCorporate; //법인번호
	private String companyPresident; //대표자명
	private String companyHomepage; //홈페이지
	private String companyAddr; //주소
	private String companyEstablish; //설립일
	private String companyClosingday; //폐업일
	private boolean companyFlag; //사용여부
}
