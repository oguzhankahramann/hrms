package hrms.projecthrms.core.utilities.verifications.concretes;

import org.springframework.stereotype.Service;

import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.core.utilities.verifications.abstracts.EmployeeConfirmService;

@Service 
public class EmployeeConfirmManager implements EmployeeConfirmService {

	
	public Result confirmUser() {
		// TODO Auto-generated method stub
		return new SuccessResult();
	}

}
