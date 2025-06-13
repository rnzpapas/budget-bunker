package com.arenz.budgetbunker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arenz.budgetbunker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
