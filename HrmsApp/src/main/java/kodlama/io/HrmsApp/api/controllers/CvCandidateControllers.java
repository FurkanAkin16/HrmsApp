package kodlama.io.HrmsApp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.Result;
import kodlama.io.HrmsApp.Entities.concretes.CvCandidate;
import kodlama.io.HrmsApp.business.abstracts.CvCandidateService;

@RestController
@RequestMapping("/api/cvcandidate")
public class CvCandidateControllers {

	private CvCandidateService cvCandidateService;

	public CvCandidateControllers(CvCandidateService cvCandidateService) {
		super();
		this.cvCandidateService = cvCandidateService;
	}

	@GetMapping("/getAll")
	DataResult<List<CvCandidate>> getAll() {
		return cvCandidateService.getAll();
	}

	@PostMapping("/add")

	public Result add(@RequestBody CvCandidate cvCandidate) {
		return this.cvCandidateService.getAll();
	}
}
