package kodlama.io.HrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.Result;
import kodlama.io.HrmsApp.Core.results.SuccessDataResult;
import kodlama.io.HrmsApp.Core.results.SuccessResult;
import kodlama.io.HrmsApp.DataAccess.abstracts.JobTitleDao;
import kodlama.io.HrmsApp.Entities.concretes.JobTitle;
import kodlama.io.HrmsApp.business.abstracts.JobTitleService;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Başlık eklendi");
	}

}
