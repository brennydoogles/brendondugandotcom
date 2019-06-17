package com.brendondugan.website.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "website", name = "footnote")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Footnote {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "text")
	private String text;
	@Column(name = "link_url")
	private String linkURL;
}
