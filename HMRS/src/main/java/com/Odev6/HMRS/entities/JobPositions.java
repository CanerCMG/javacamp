package com.Odev6.HMRS.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class JobPositions {
	
	
	@Id
	@Column(name="job_id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
		
	public JobPositions(){};
	
	
	public JobPositions(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	
}
