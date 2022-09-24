package hrms.projecthrms.core.utilities.verifications.abstracts;

import hrms.projecthrms.core.utilities.results.Result;

public interface EmailVerificationService {

	
	public Result verifyEmail(String email);
}
