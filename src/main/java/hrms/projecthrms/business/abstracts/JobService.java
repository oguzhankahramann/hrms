package hrms.projecthrms.business.abstracts;

import java.util.List;

import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.entities.concretes.Job;

public interface JobService {
	DataResult<List<Job>> getAll();
}
