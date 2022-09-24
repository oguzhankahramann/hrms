package hrms.projecthrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.projecthrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
