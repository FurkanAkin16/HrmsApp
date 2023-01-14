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
@Table(name = "EmployerJobPosting")
public class EmployerJobPosting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "posting_id")
	private int id;

	@Column(name = "job_position")
	private String jobPosition;

	@Column(name = "job_description")
	private String jobDescription;

	@Column(name = "city")
	private String city;

	@Column(name = "salary")
	private String salary;

	@Column(name = "open_position")
	private int openPosition;

	@Column(name = "deadline")
	private String deadline;
}
