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
import kodlama.io.HrmsApp.Entities.concretes.Employees;
import kodlama.io.HrmsApp.business.abstracts.EmployeesService;

@RestController
@RequestMapping("/api/employees")
public class EmployeesControllers {
	private EmployeesService employeesService;

	@Autowired
	private EmployeesControllers(EmployeesService employeesService) {
		this.employeesService = employeesService;
	}

	@GetMapping("/getAll")
	DataResult<List<Employees>> getAll() {
		return employeesService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employees employees) {
		return this.employeesService.getAll();

	}
}
