package kodlama.io.HrmsApp.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsApp.Entities.concretes.CvCandidate;

public interface CvCandidateDao extends JpaRepository<CvCandidate, Integer> {

}
