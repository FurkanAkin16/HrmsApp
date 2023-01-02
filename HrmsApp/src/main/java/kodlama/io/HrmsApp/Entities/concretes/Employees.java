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
@Table(name = "employess")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "sur_name")
	private String surName;

	@Column(name = "tcno")
	private String tcno;

	@Column(name = "mail")
	private String mail;

	@Column(name = "password")
	private String password;

	@Column(name = "year")
	private int year;

}