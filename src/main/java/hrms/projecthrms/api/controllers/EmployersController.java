package hrms.projecthrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.projecthrms.business.abstracts.EmployerService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.Employer;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.*;
@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add( employer);
	}
	
}
