package day15.day15.repositories;

import org.springframework.stereotype.Repository;
import day15.day15.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	  Boolean existsByKey(Double key);
	  
}
