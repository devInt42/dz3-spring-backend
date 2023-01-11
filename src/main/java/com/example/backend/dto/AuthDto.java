package com.example.backend.dto;

import lombok.Data;

@Data
public class AuthDto {
	private int authSeq;
	private String authCode;
	private String authName;
	
	
	private int Page;
	private int startPgNum;
	private int endPgNum;
}
