package kodlama.io.HrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.SuccessDataResult;
import kodlama.io.HrmsApp.DataAccess.abstracts.EmployerJobPostingDao;
import kodlama.io.HrmsApp.Entities.concretes.EmployerJobPosting;
import kodlama.io.HrmsApp.business.abstracts.EmployerJobPostingService;

@Service
public class EmployerJobPostingManager implements EmployerJobPostingService {

	private EmployerJobPostingDao employerJobPostingDao;

	@Autowired
	public EmployerJobPostingManager(EmployerJobPostingDao employerJobPostingDao) {
		this.employerJobPostingDao = employerJobPostingDao;
	}

	@Override
	public DataResult<List<EmployerJobPosting>> getAll() {
		return new SuccessDataResult<List<EmployerJobPosting>>(this.employerJobPostingDao.findAll(), "Data Listelendi");
	}

}
