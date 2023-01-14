package kodlama.io.HrmsApp.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsApp.Entities.concretes.ActiveJobPostings;

public interface ActiveJobPostingDao extends JpaRepository<ActiveJobPostings, Integer> {

}
