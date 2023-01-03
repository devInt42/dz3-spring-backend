package com.example.backend.dto;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
public class CompanyDto {
	
//	private int companyCode, companyAccountant;
//	private String companyName, companyAbbreviation, companyItem, companyBusniess,
//					companyPageaddress, companyStartdate, companyOpening, companyClose;
//	private String companyIdcategory;
	private int company_code;
	private String company_name, company_category, company_call, company_regist,
								company_president, company_domain, company_addr, company_homepage;
	public int getCompany_code() {
		return company_code;
	}
	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_category() {
		return company_category;
	}
	public void setCompany_category(String company_category) {
		this.company_category = company_category;
	}
	public String getCompany_call() {
		return company_call;
	}
	public void setCompany_call(String company_call) {
		this.company_call = company_call;
	}
	public String getCompany_regist() {
		return company_regist;
	}
	public void setCompany_regist(String company_regist) {
		this.company_regist = company_regist;
	}
	public String getCompany_president() {
		return company_president;
	}
	public void setCompany_president(String company_president) {
		this.company_president = company_president;
	}
	public String getCompany_domain() {
		return company_domain;
	}
	public void setCompany_domain(String company_domain) {
		this.company_domain = company_domain;
	}
	public String getCompany_addr() {
		return company_addr;
	}
	public void setCompany_addr(String company_addr) {
		this.company_addr = company_addr;
	}
	public String getCompany_homepage() {
		return company_homepage;
	}
	public void setCompany_homepage(String company_homepage) {
		this.company_homepage = company_homepage;
	}
	@Override
	public String toString() {
		return "CompanyDto [company_code=" + company_code + ", company_name=" + company_name + ", company_category="
				+ company_category + ", company_call=" + company_call + ", company_regist=" + company_regist
				+ ", company_president=" + company_president + ", company_domain=" + company_domain + ", company_addr="
				+ company_addr + ", company_homepage=" + company_homepage + "]";
	}
	
}
