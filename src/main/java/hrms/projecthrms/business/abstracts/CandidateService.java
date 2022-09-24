package hrms.projecthrms.business.abstracts;

import java.util.List;

import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.Candidate;


public interface CandidateService {
	 
	 DataResult<List<Candidate>> getAll();
	 Result add(Candidate candidate);
}
