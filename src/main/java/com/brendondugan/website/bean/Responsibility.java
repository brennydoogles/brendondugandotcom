package com.brendondugan.website.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "website", name = "responsibility")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responsibility {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "description")
	private String description;
	@Column(name = "work_experience_id")
	private int workExperienceID;
}
