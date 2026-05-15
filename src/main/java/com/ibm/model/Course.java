package com.ibm.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @Entity
public class Course {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

private String name;
private String email;
private String domain;

}
