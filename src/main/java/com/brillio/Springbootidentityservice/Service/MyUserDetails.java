package com.brillio.Springbootidentityservice.Service;

import com.brillio.Springbootidentityservice.Model.UserCredential;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MyUserDetails implements UserDetails {

    private String username;
    private String password;
    private int user_id;

    public MyUserDetails(UserCredential userCredential){
        this.username=userCredential.getUsername();
        this.password=userCredential.getPassword();
        this.user_id=userCredential.getUser_id();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    //@Override
    public int getUserId() {
        return user_id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
