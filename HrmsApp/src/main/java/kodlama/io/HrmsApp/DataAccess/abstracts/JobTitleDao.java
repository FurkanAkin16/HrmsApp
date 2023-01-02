package kodlama.io.HrmsApp.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsApp.Entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
