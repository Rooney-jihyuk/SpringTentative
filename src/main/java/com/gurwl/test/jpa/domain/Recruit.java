package com.gurwl.test.jpa.domain;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name="recruit")
public class Recruit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int companyId;
	private String position;
	private String responsibilities;
	private String qualification;
	private String type;
	private String region;
	private int salary;
	private ZonedDateTime deadline;
	
	@UpdateTimestamp
	@Column(name="createdAt", updatable=false)
	private ZonedDateTime createdAt;
	@UpdateTimestamp
	@Column(name="updatedAt")
	private ZonedDateTime updatedAt;
}
