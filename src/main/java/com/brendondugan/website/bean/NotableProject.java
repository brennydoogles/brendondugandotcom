package com.brendondugan.website.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "website", name = "notable_project")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotableProject {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "description")
	private String description;
	@Column(name = "work_experience_id")
	private int workExperienceID;
	@ManyToMany
	@JoinTable(
		name = "footnote_on_project",
		schema = "website",
		joinColumns = {
			@JoinColumn(name = "project_id")
		},
		inverseJoinColumns = {
			@JoinColumn(name = "footnote_id")
		}
	)
	private Set<Footnote> footnotes = new HashSet<>();
}
