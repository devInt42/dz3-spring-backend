CREATE TABLE `employee` (
	`employee_code` INT(11) NOT NULL AUTO_INCREMENT,
	`employee_id` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_name` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`employee_birth` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_call` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_pwd` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_ph` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_pmail` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_cmail` VARCHAR(50) NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_addr` VARCHAR(200) NOT NULL DEFAULT '0' COLLATE 'utf8_general_ci',
	`employee_dept` INT(11) NOT NULL,
	PRIMARY KEY (`employee_code`) USING BTREE
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=6
;