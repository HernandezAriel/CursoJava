package com.apiUsers.apiUsers.configuration;





import com.apiUsers.apiUsers.model.User;
import com.apiUsers.apiUsers.repository.UserRepository;
import com.apiUsers.apiUsers.repository.UserSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class JwtDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        //final User retrievedUser = userRepository.findByUsername(username);
        User user = userRepository.findByUsername(username).get();
        if(user == null){
            throw new UsernameNotFoundException("El usuario no existe");
        }else{
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new JwtUser(user.getUsername(),user.getPassword(),authorities);
        }
    }

}
