package hrms.projecthrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.projecthrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{

}
