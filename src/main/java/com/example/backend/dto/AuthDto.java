package com.example.backend.dto;

import lombok.Data;

@Data
public class AuthDto {
	private int authSeq;
	private String authCode;
	private String authName;
}
