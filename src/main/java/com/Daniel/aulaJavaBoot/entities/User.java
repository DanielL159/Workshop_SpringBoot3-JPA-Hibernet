package com.Daniel.aulaJavaBoot.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//indica que e uma entidade que sera traformada de POO para Banco de Dados Relacional
@Table(name="tb_user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id/*Indica pro navegador o atributo a baixo e a chave primaria */
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que no banco de dados a chave primaria sera auto incrementada
	private Long id ;
	private String name ;
	private String email ;
	private String phone ;
	private String passoword ;
	
	public User() {
	}

	public User(Long id, String name, String email, String phone, String passoword) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passoword = passoword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassoword() {
		return passoword;
	}

	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

	
}