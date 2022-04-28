package day15.day15.repositories;

import org.springframework.stereotype.Repository;
import day15.day15.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	  Boolean existsByEmail(String email);
	  
}