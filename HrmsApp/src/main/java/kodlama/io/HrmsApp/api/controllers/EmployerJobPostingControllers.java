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
import kodlama.io.HrmsApp.Entities.concretes.EmployerJobPosting;
import kodlama.io.HrmsApp.business.abstracts.EmployerJobPostingService;

@RestController
@RequestMapping("/api/EmployerJobPosting")
public class EmployerJobPostingControllers {
	private EmployerJobPostingService employerJobPostingService;

	@Autowired

	private EmployerJobPostingControllers(EmployerJobPostingService employerJobPostingService) {
		this.employerJobPostingService = employerJobPostingService;
	}

	@GetMapping("/getAll")
	DataResult<List<EmployerJobPosting>> getAll() {
		return employerJobPostingService.getAll();
	}

	@PostMapping("/add")

	public Result add(@RequestBody EmployerJobPosting employerJobPosting) {
		return this.employerJobPostingService.getAll();
	}
}
