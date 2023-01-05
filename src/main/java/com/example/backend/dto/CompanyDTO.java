package com.example.backend.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data

@Table(name = "company1")
public class CompanyDTO {
	
	@Id
	@Column("company_seq")
	private int companySeq;
	
	@Column("company_code")
	private int companyCode;
	
	@Column("company_name")
	private String companyName;
	
	@Column("company_business")
	private String companyBusiness;
	
	@Column("company_item")
	private String companyItem;
	
	@Column("company_call")
	private String companyCall;
	
	@Column("company_regist")
	private String companyRegist;
	
	@Column("company_corporate")
	private String companyCorporate;
	
	@Column("company_president")
	private String companyPresident;
	
	@Column("company_homepage")
	private String companyHomepage;
	
	@Column("company_addr")
	private String companyAddr;
	
	@Column("company_establish")
	private String companyEstablish;
	
	@Column("company_closingday")
	private String companyClosingday;
	
	@Column("flag")
	private boolean companyFlag;
}
