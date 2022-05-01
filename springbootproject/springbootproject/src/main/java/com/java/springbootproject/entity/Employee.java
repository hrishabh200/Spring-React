package com.java.springbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_employees")
@Data
@AllArgsConstructor
@NoArgsConstructor //ctrl+space
public class Employee 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long Id;
	private String name;
	private String department;
	private String location;
	
	
}
