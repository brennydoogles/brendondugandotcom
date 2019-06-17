package com.brendondugan.website.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "website", name = "skill")
public class Skill {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "display_name")
	private String displayName;
	@Column(name = "skill_type")
	private String skillType;
	@Column(name = "familiarity")
	private String familiarity;
}
