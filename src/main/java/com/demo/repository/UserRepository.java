package com.demo.repository;

import com.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


//JpaRepository<도메인, ID의 type>
public interface UserRepository extends JpaRepository<User, String> {


}
