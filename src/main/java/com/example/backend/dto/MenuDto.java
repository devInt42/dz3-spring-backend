package com.example.backend.dto;

import lombok.Data;

@Data
public class MenuDto {
	private int menuSeq;
	private int menuCode;
	private String menuName;
	private int menuParent;
	private int menuDepth;
}