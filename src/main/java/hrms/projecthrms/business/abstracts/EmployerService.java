package hrms.projecthrms.business.abstracts;

import java.util.List;

import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();
	

}
