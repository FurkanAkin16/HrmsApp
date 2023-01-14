package kodlama.io.HrmsApp.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cv_candidates")
public class CvCandidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "sur_name")
	private String surName;

	@Column(name = "school")
	private String school;

	@Column(name = "year_of_the_school")
	private String yearOfTheSchool;

	@Column(name = "graduation")
	private String graduation;

	@Column(name = "experience")
	private String experience;

	@Column(name = "experience_of_the_year")
	private String experienceOfTheYear;

	@Column(name = "quit_of_the_year")
	private String quitOfTheYear;

	@Column(name = "languages")
	private String languages;

	@Column(name = "git_hub")
	private String gitHub;

	@Column(name = "linkedin")
	private String linkedin;

	@Column(name = "programming_languages")
	private String programmingLanguages;

	@Column(name = "cover_letter")
	private String coverLetter;

}
