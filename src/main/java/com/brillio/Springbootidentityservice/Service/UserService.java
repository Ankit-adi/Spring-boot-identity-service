package com.brillio.Springbootidentityservice.Service;

import com.brillio.Springbootidentityservice.Model.UserCredential;
import com.brillio.Springbootidentityservice.Repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

 @Autowired
 UserCredentialRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Logic to get user from the database
        Optional<UserCredential> credential = repository.findByUsername(username);
        return credential.map(MyUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("user not found with name :" + username));
    }
       // return new User("admin","password",new ArrayList<>());
}
