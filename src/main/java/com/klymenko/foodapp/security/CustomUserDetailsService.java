package com.klymenko.foodapp.security;

import com.klymenko.foodapp.auth_users.entity.User;
import com.klymenko.foodapp.auth_users.repository.UserRepository;
import com.klymenko.foodapp.exceptions.NotFoundException;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findUserByEmail(username)
                .orElseThrow(() -> new NotFoundException("User not found"));

        return AuthUser.builder()
                .user(user)
                .build();
    }
}
