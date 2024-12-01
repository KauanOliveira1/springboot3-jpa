package com.exemple.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
