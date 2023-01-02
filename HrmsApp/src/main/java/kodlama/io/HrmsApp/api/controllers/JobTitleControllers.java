package kodlama.io.HrmsApp.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.Result;
import kodlama.io.HrmsApp.Entities.concretes.JobTitle;
import kodlama.io.HrmsApp.business.abstracts.JobTitleService;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleControllers {

	private JobTitleService jobTitleService;

	@Autowired
	public JobTitleControllers(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobTitle>> getAll() {
		return jobTitleService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
}
