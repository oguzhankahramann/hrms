package hrms.projecthrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.projecthrms.business.abstracts.CityService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.entities.concretes.Cities;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	private CityService cityService;
	@Autowired
	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	@GetMapping("/getall")
	public DataResult<List<Cities>> getAll(){
		return this.cityService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Cities  cities) {
		this.cityService.getAll();
		return new SuccessResult();
		
	}
}
