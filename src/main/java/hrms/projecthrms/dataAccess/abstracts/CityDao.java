package hrms.projecthrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.projecthrms.entities.concretes.Cities;

public interface CityDao extends JpaRepository<Cities, Integer> {
	Cities findBycityName(String cityName);
}
