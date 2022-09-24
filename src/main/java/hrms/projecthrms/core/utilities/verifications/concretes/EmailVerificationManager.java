	package hrms.projecthrms.core.utilities.verifications.concretes;

import org.springframework.stereotype.Service;

import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.core.utilities.verifications.abstracts.EmailVerificationService;
@Service
public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public Result verifyEmail(String email) {
		
		return new SuccessResult();
	}
	//bu methot employer icin yazilmistir contains boolean deger donduruyor
	public static boolean checkEmailDomain(String companyWebsite, String email) {
		return companyWebsite.contains(email.split("@")[1]);
	}
	

}
