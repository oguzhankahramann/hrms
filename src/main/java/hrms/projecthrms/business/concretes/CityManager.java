package hrms.projecthrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projecthrms.business.abstracts.CityService;
import hrms.projecthrms.business.constants.Messages;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.ErrorResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessDataResult;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.dataAccess.abstracts.CityDao;
import hrms.projecthrms.entities.concretes.Cities;

@Service
public class CityManager  implements CityService{
	private CityDao cityDao;
  @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
		
	}
@Override
public DataResult<List<Cities>> getAll() {
	// TODO Auto-generated method stub
	return new SuccessDataResult<List<Cities>>(this.cityDao.findAll(),Messages.citiesListedSuccessfully);
}
@Override
public Result add(Cities cities) {
	// TODO Auto-generated method stub
	if(this.cityDao.findBycityName(cities.getCityName())!=null) {
	this.cityDao.save(cities);
	return new SuccessResult(Messages.cityAddedSuccessfully);
	}
	else  {
		return new ErrorResult(Messages.cityIsExist);
	}
}
	
}
