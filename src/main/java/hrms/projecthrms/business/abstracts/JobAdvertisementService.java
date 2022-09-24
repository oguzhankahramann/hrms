package hrms.projecthrms.business.abstracts;

import java.util.List;

import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.JobAdvertisements;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisements>> getAll();
	Result add(JobAdvertisements advertisements);
	
	DataResult<List<JobAdvertisements>> findAllByIsActiveTrue();
	//DataResult<List<JobAdvertisements>> getByIsActiveTrueOrderByApplicationDeadlineDesc();
	DataResult<List<JobAdvertisements>> findAllByEmployer_CompanyNameAndIsActiveTrue(String companyName);
	Result changeActivate(int id);
}
