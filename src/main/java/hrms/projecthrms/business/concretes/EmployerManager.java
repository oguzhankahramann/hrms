package hrms.projecthrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projecthrms.business.abstracts.EmployerService;
import hrms.projecthrms.business.constants.Messages;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.ErrorResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessDataResult;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.core.utilities.verifications.abstracts.EmailVerificationService;
import hrms.projecthrms.core.utilities.verifications.abstracts.EmployeeConfirmService;
import hrms.projecthrms.core.utilities.verifications.concretes.EmailVerificationManager;
import hrms.projecthrms.dataAccess.abstracts.EmployerDao;
import hrms.projecthrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private EmployeeConfirmService employeeConfirmService;
	private EmailVerificationService emailVerificationService;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao,EmployeeConfirmService employeeConfirmService,EmailVerificationService emailVerificationService) {
		super();
		this.employerDao = employerDao;
		this.employeeConfirmService=employeeConfirmService;
		this.emailVerificationService=emailVerificationService;
		
	}
	@Override
	public Result add(Employer employer) {
		if(this.employerDao.findByEmail(employer.getEmail())!=null) {
		return new ErrorResult(Messages.mailIsValid);
		}
		else if (!EmailVerificationManager.checkEmailDomain(employer.getWebAdress(), employer.getEmail())){
			return new ErrorResult(Messages.domaindAndMailMustBeSame);
		}
		else if(!this.emailVerificationService.verifyEmail(employer.getEmail()).isSuccess()) {
			return new ErrorResult(Messages.verifyLink);
					
		}
		else if(!this.employeeConfirmService.confirmUser().isSuccess()) 
		{
			return new ErrorResult(Messages.employerNotApproved);
		}
		else {
			
			this.employerDao.save(employer);
			return new SuccessResult(Messages.employerSavedSuccessfully);
		}
		
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),Messages.employerSavedSuccessfully);
	}

}
