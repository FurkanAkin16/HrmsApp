package kodlama.io.HrmsApp.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsApp.Entities.concretes.EmployerJobPosting;

public interface EmployerJobPostingDao extends JpaRepository<EmployerJobPosting, Integer> {

}
