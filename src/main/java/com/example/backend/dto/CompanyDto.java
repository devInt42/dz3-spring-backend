package com.example.backend.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class CompanyDto {
	private int companySeq;
	private int companyCode;
	private String companyName;
	private String companyBusiness;
	private String companyItem;
	private String companyCall;
	private String companyRegist;
	private String companyCorporate;
	private String companyPresident;
	private String companyHomepage;
	private String companyAddr;
	private Date companyEstablish;
	private Date companyClosingDay;
	private String companyFax;
	private String companyZipCode;
	private String companyForeigner;
	private String useYN;
	private String pcBuisness;

	public CompanyDto(int companyCode, String companyName, String useYN) {
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.useYN = useYN;
	}
}