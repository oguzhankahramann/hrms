package hrms.projecthrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hrms.projecthrms.business.abstracts.CandidateService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.entities.concretes.Candidate;



@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

	private CandidateService candidateService;
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
		}
	
	public Result addCandidate(Candidate candidate) {
		return candidateService.add(candidate);
	}
	
	

}
