package hrms.projecthrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.projecthrms.business.abstracts.UserService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.User;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	@GetMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
	
}
