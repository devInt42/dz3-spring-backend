package com.example.backend.dto;

import lombok.Data;

@Data
public class MenuDto {
	private int menu_id;
	private String menu_name;
	private int menu_parent;
	private int menu_depth;
}
