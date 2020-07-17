package com.learning.springsecurityjpa;

import com.learning.springsecurityjpa.model.MyUserDetails;
import com.learning.springsecurityjpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private MyUserDetails userDetails;

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findUserByUsername( username );
        user.orElseThrow(()-> new UsernameNotFoundException( "Not found:"+username ) );
        return new MyUserDetails(username);
    }
}
