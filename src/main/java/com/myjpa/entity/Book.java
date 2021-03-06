package com.myjpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "BIZ_BOOK")
@Component
public class Book implements Serializable{

	private static final long serialVersionUID = 4091483928436647607L;

	@Id
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name="system-uuid", strategy = "uuid")  
	private String id;
	
	@Column(name="NAME")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
