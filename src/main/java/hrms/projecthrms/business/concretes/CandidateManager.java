package hrms.projecthrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projecthrms.business.abstracts.CandidateService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.ErrorResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessDataResult;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.core.utilities.verifications.abstracts.EmailVerificationService;
import hrms.projecthrms.dataAccess.abstracts.CandidateDao;
import hrms.projecthrms.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService {
	
	@Autowired
	private CandidateDao candidateDao;
	@Autowired
	private EmailVerificationService emailVerificationService;
	

	public CandidateManager() {
		
	}

	
	private Result isEmailExist(String email) {
		
		if(this.candidateDao.findByEmail(email)!= null) {
			return new ErrorResult("You have entered a used mail address!");
		}
			return new SuccessResult("You can use your mail address");
 	 
	}
	private Result isIdentityNoExist(String identityNumber) {
		
		if(this.candidateDao.findByIdentityNumber(identityNumber)!= null) {
			return new ErrorResult("You have entered invalid identity no!");
		}
			return new SuccessResult();
	}
	
	
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
			return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(),"İş arayanlar başarıyla listelendi");
	}
	
	@Override
	public Result add(Candidate candidate) {
	
		if(!this.isEmailExist(candidate.getEmail()).isSuccess() || !this.isIdentityNoExist(candidate.getIdentityNumber()).isSuccess()){
			return new ErrorResult("You have entered invalid identity no or You have entered a used mail address!");
		}
		

		
		else if (!this.emailVerificationService.verifyEmail(candidate.getEmail()).isSuccess()) {
			return new ErrorResult("Check your email please");
		}
		else { 
			this.candidateDao.save(candidate);
			return new SuccessResult("Job seeker saved succesfuly");
		} 
	}

	

}
