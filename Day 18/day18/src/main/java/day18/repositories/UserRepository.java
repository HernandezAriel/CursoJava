package day18.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day18.day18.models.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

    public boolean exitsByUserName(String userName);
    
}
