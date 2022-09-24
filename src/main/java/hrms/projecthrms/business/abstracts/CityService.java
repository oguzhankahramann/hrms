package hrms.projecthrms.business.abstracts;

import java.util.List;

import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.Cities;

public interface CityService {
	DataResult<List<Cities>> getAll();
	
	Result add(Cities cities);
}
