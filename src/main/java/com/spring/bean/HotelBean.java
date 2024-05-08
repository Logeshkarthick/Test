package com.spring.bean;


	

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hotel")
public class HotelBean {
	
	@Id
	
	private int rmid;
	@Column(name="rmtype")
	private String rmtype;
	@Column(name="rmtariff")
	private String rmtariff;
	@Column(name="rmdesc")
	private String rmdesc;
	@Column(name="rmoccup")
	private String rmoccup;
	public HotelBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelBean(int rmid, String rmtype, String rmtariff, String rmdesc, String rmoccup) {
		super();
		this.rmid = rmid;
		this.rmtype = rmtype;
		this.rmtariff = rmtariff;
		this.rmdesc = rmdesc;
		this.rmoccup = rmoccup;
	}
	public int getRmid() {
		return rmid;
	}
	public void setRmid(int rmid) {
		this.rmid = rmid;
	}
	public String getRmtype() {
		return rmtype;
	}
	public void setRmtype(String rmtype) {
		this.rmtype = rmtype;
	}
	public String getRmtariff() {
		return rmtariff;
	}
	public void setRmtariff(String rmtariff) {
		this.rmtariff = rmtariff;
	}
	public String getRmdesc() {
		return rmdesc;
	}
	public void setRmdesc(String rmdesc) {
		this.rmdesc = rmdesc;
	}
	public String getRmoccup() {
		return rmoccup;
	}
	public void setRmoccup(String rmoccup) {
		this.rmoccup = rmoccup;
	}
	
	
}
