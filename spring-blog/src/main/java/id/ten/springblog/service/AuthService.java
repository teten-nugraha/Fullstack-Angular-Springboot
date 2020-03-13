package id.ten.springblog.service;

import id.ten.springblog.dto.LoginRequestDto;
import id.ten.springblog.dto.RegisterRequestDto;
import id.ten.springblog.model.User;
import id.ten.springblog.repository.UserRepository;
import id.ten.springblog.security.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Project Name     : spring-blog
 * Date Time        : 3/13/2020
 *
 * @author Teten Nugraha
 */

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    public void signUp(RegisterRequestDto registerRequestDto) {
        User user = new User();
        user.setUsername(registerRequestDto.getUsername());
        user.setPassword(encodePassword(registerRequestDto.getPassword()));
        user.setEmail(registerRequestDto.getEmail());
        userRepository.save(user);
    }

    private String encodePassword(String plainText) {
        return passwordEncoder.encode(plainText);
    }

    public String login(LoginRequestDto loginRequestDto) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequestDto.getUsername(), loginRequestDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        return jwtProvider.generateToken(authenticate);
    }
}
