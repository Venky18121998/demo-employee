package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpInformation {
	public Long empId;
	public String firstName;
	public String lastName;
	public String city;
	public String villeage;
	public String addres;

}
