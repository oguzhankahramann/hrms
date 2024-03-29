package hrms.projecthrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.projecthrms.entities.concretes.Candidate;



public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	Candidate findByEmail (String email);
	Candidate findByIdentityNumber (String identityNumber);
	
}
