package hrms.projecthrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.projecthrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	Employer findByEmail(String email);
	
}
