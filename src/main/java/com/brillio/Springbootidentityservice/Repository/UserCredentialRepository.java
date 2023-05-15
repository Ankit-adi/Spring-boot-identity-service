package com.brillio.Springbootidentityservice.Repository;

import com.brillio.Springbootidentityservice.Model.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository extends JpaRepository<UserCredential,Integer> {

    Optional<UserCredential> findByUsername(String username);
}
