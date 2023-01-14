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
@Table(name = "active_job_postings")
public class ActiveJobPostings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "posting_id")
	private int id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "job_position_name")
	private String jobPositionName;

	@Column(name = "number_of_open_positions")
	private int numberOfOpenPositions;

	@Column(name = "ad_publication_date")
	private String adPublicationDate;

	@Column(name = "deadline")
	private String deadline;

}
