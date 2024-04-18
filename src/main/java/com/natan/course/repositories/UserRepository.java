package com.natan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
