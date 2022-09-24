package hrms.projecthrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projecthrms.business.abstracts.UserService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessDataResult;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.dataAccess.abstracts.UserDao;
import hrms.projecthrms.entities.concretes.User;
@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		this.userDao.save(user);
		return new SuccessResult();
	}

}
