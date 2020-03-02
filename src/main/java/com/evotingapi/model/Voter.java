package com.evotingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voters")
public class Voter {
	public Voter() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	@Column(name="vin")
	private int vin;
	@Column(name="city")
	private String city;
//	@Column(name="imagename")
//	private String imagename;
//	@Column(name="pic_byte", length=1000)
//	private byte[] pic_byte;
//	@Column(name="type")
//	private String type;
	@Column(name="password")
	private String password;
	public Voter(Long id, String name, int vin, String city, String password) {
		super();
		this.id = id;
		this.name = name;
		this.vin = vin;
		this.city = city;
//		this.imagename = imagename;
//		this.pic_byte = pic_byte;
//		this.type = type;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	public String getImagename() {
//		return imagename;
//	}
//
//	public void setImagename(String imagename) {
//		this.imagename = imagename;
//	}
//
//	public byte[] getPic_byte() {
//		return pic_byte;
//	}
//
//	public void setPic_byte(byte[] pic_byte) {
//		this.pic_byte = pic_byte;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
}
