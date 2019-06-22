package com.brendondugan.website.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "website", name = "work_experience")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "key")
	private String key;
	@Column(name = "job_title")
	private String jobTitle;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;

	@ManyToMany
	@JoinTable(
		name = "skill_used_at_job",
		schema = "website",
		joinColumns = {
			@JoinColumn(name = "work_experience_id")
		},
		inverseJoinColumns = {
			@JoinColumn(name = "skill_id")
		}
	)
	private Set<Skill> skills = new HashSet<>();

	@OneToMany
	@JoinColumn(name = "work_experience_id")
	private Set<Responsibility> responsibilities = new HashSet<>();

	@OneToMany
	@JoinColumn(name = "work_experience_id")
	private Set<NotableProject> projects = new HashSet<>();
}
