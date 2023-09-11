package com.nt.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String pwd;
	
//	@ElementCollection
//	@CollectionTable(name="rolesTab",joinColumns = @JoinColumn(name="uid"))
//	private List<String> roles;
}
