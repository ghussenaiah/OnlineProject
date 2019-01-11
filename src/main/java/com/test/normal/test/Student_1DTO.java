package com.test.normal.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.io.File;
import java.util.Set;
import java.util.HashSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
/*import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;*/

public class Student_1DTO
		implements
			java.io.Serializable {


	@JsonProperty("id")
	private String id;
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("sname")
	private String sname;
	
	@JsonProperty("sdateTime")
	private Date sdateTime;

	@JsonProperty("sdate")
	private Date sdate;

	@JsonIgnore
	public String getId() {
		return id;
	}

	@JsonIgnore
	public void setId(String id) {
		this.id = id;
	}

	@JsonIgnore
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonIgnore
	public String getSname() {
		return sname;
	}

	@JsonIgnore
	public void setSname(String sname) {
		this.sname = sname;
	}

	@JsonIgnore
	public Date getSdateTime() {
		return sdateTime;
	}

	@JsonIgnore
	public void setSdateTime(Date sdateTime) {
		this.sdateTime = sdateTime;
	}

	@JsonIgnore
	public Date getSdate() {
		return sdate;
	}

	@JsonIgnore
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

		}