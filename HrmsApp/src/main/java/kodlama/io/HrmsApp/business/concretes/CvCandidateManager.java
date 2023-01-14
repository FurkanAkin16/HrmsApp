package kodlama.io.HrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.SuccessDataResult;
import kodlama.io.HrmsApp.DataAccess.abstracts.CvCandidateDao;
import kodlama.io.HrmsApp.Entities.concretes.CvCandidate;
import kodlama.io.HrmsApp.business.abstracts.CvCandidateService;

@Service
public class CvCandidateManager implements CvCandidateService {

	private CvCandidateDao cvCandidateDao;

	@Autowired
	public CvCandidateManager(CvCandidateDao cvCandidateDao) {
		this.cvCandidateDao = cvCandidateDao;
	}

	@Override
	public DataResult<List<CvCandidate>> getAll() {
		return new SuccessDataResult<List<CvCandidate>>(this.cvCandidateDao.findAll(), "Data Listelendi");
	}

}
