package kodlama.io.HrmsApp.business.abstracts;

import java.util.List;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.Result;
import kodlama.io.HrmsApp.Entities.concretes.JobTitle;

public interface JobTitleService {

	DataResult<List<JobTitle>> getAll();

	Result add(JobTitle jobTitle);

}
