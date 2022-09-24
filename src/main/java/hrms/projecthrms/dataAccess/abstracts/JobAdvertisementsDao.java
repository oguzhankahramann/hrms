package hrms.projecthrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.projecthrms.entities.concretes.JobAdvertisements;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public interface JobAdvertisementsDao extends JpaRepository<JobAdvertisements, Integer> {

	List<JobAdvertisements> findAllByIsActiveTrue();
	
	// Aktif iş ilanları tarihe göre listelenir.
	@Query("From JobAdvertisements where isActive=true Order By openingDate Desc")
	List<JobAdvertisements>getByIsActiveTrueOrderByApplicationDeadlineDesc(Sort sort); 
	//bir firmaya ait aktif is ilanlari
	
	List<JobAdvertisements> findAllByEmployer_CompanyNameAndIsActiveTrue(String companyName);
	
	
	
	
}
