package hrms.projecthrms.business.abstracts;

import java.util.List;

import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);

}
