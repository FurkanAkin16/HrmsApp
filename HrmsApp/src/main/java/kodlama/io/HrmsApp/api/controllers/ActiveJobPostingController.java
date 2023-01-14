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
import kodlama.io.HrmsApp.Entities.concretes.ActiveJobPostings;
import kodlama.io.HrmsApp.business.abstracts.ActiveJobPostingService;

@RestController
@RequestMapping("/api/ActiveJobPosting")
public class ActiveJobPostingController {

	private ActiveJobPostingService activeJobPostingService;

	@Autowired
	private ActiveJobPostingController(ActiveJobPostingService activeJobPostingService) {
		this.activeJobPostingService = activeJobPostingService;
	}

	@GetMapping("/getAll")

	DataResult<List<ActiveJobPostings>> getAll() {
		return activeJobPostingService.getAll();
	}

	@PostMapping("/add")

	public Result add(@RequestBody ActiveJobPostings activeJobPostings) {
		return this.activeJobPostingService.getAll();
	}
}
