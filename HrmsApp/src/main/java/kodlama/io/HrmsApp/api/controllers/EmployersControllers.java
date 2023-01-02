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
import kodlama.io.HrmsApp.Entities.concretes.Employers;
import kodlama.io.HrmsApp.business.abstracts.EmployersService;

@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {
	private EmployersService employersService;

	@Autowired
	private EmployersControllers(EmployersService employersService) {
		this.employersService = employersService;
	}

	@GetMapping("/getAll")
	DataResult<List<Employers>> getAll() {
		return employersService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employers employers) {
		return this.employersService.getAll();
	}
}
