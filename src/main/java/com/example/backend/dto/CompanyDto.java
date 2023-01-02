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
	private int company_code, company_accountant;
	private String company_name, company_abbreviation, company_item, company_busniess,
					company_pageaddress, company_startdate, company_opening, company_close;
	private String company_idcategory;
	public int getCompany_code() {
		return company_code;
	}
	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}
	public int getCompany_accountant() {
		return company_accountant;
	}
	public void setCompany_accountant(int company_accountant) {
		this.company_accountant = company_accountant;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_abbreviation() {
		return company_abbreviation;
	}
	public void setCompany_abbreviation(String company_abbreviation) {
		this.company_abbreviation = company_abbreviation;
	}
	public String getCompany_item() {
		return company_item;
	}
	public void setCompany_item(String company_item) {
		this.company_item = company_item;
	}
	public String getCompany_busniess() {
		return company_busniess;
	}
	public void setCompany_busniess(String company_busniess) {
		this.company_busniess = company_busniess;
	}
	public String getCompany_pageaddress() {
		return company_pageaddress;
	}
	public void setCompany_pageaddress(String company_pageaddress) {
		this.company_pageaddress = company_pageaddress;
	}
	public String getCompany_startdate() {
		return company_startdate;
	}
	public void setCompany_startdate(String company_startdate) {
		this.company_startdate = company_startdate;
	}
	public String getCompany_opening() {
		return company_opening;
	}
	public void setCompany_opening(String company_opening) {
		this.company_opening = company_opening;
	}
	public String getCompany_close() {
		return company_close;
	}
	public void setCompany_close(String company_close) {
		this.company_close = company_close;
	}
	public String getCompany_idcategory() {
		return company_idcategory;
	}
	public void setCompany_idcategory(String company_idcategory) {
		this.company_idcategory = company_idcategory;
	}
	
}
