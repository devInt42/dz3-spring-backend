package com.example.backend.dto;

import lombok.Data;

@Data
public class CompanyDto {
	
	private int company_code, company_accountant;
	private String company_name, company_abbreviation, company_item, company_busniess,
					company_pageaddress, company_startdate, company_opening, company_close;
	private String company_idcategory;
	
}
