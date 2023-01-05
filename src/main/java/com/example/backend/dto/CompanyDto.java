package com.example.backend.dto;

import java.util.Date;

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
	private int companyPresident;
	private String companyHomepage;
	private String companyAddr;
	private Date companyEstablish;
	private Date companyClosingDay;
	private int flag;

}