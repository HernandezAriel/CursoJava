package day13.day13.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import day13.day13.models.User;

public interface UserRepository extends MongoRepository<User, String>{

    List<User> findByDni(int dni);
    
}
