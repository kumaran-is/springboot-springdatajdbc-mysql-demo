package com.college.demo.student;

import java.time.LocalDate;
import java.time.Period;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

/*
 * Note: If name of POJO and the database table is same, we can omit the @Table
 * Lombok @Data annotation to generate default getters and setters
 * Access methods and parameterised constructors are not mandatory for a POJO to map to database table
 *  */

@Data
@Table("student")
public class Student {
    
	@Id
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	@Transient
	private Integer age;
	
	public Integer getAge() {
		return Period.between(dob, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}

	public String getEmail() {
		return email;
	}

	public Object getName() {
		return name;
	}
	
}
