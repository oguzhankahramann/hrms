package hrms.projecthrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projecthrms.business.abstracts.JobService;
import hrms.projecthrms.business.constants.Messages;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.SuccessDataResult;
import hrms.projecthrms.dataAccess.abstracts.JobDao;
import hrms.projecthrms.entities.concretes.Job;
@Service
public class JobManager implements JobService{
	
private JobDao jobDao;
 @Autowired
	public JobManager(JobDao jobDao) {
	super();
	this.jobDao = jobDao;
}
@Override
public DataResult<List<Job>> getAll() {
	// TODO Auto-generated method stub
	return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),Messages.jobListedSuccessfully);
	//ne dondurmek istedigimizi ctorunun icine attik geri kalani generic kisimda yapistirdik.
			
}


	
	

}
