package com.example.backend.dto;

import lombok.Data;

@Data
public class MenuTestDto {
	private int menu_code;
	private String menu_id;
	private String menu_name;
	private String menu_parent;
	private int menu_depth;
}
