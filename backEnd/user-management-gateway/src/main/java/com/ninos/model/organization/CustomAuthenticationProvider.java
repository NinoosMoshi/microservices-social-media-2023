package com.ninos.model.organization;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ninos.repository.OrganizationRepository;


@AllArgsConstructor
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final OrganizationRepository organizationRepository;
    private final PasswordEncoder passwordEncoder;



    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String referenceId = authentication.getName();
        String password = authentication.getCredentials().toString();

        Optional<Organization> organization = organizationRepository.findByReferenceId(referenceId);
        if (organization.isPresent()){
           if (passwordEncoder.matches(password, organization.get().getPassword())){
               List<GrantedAuthority> authorityList = new ArrayList<>();
               authorityList.add(new SimpleGrantedAuthority("organization_user"));

               return new UsernamePasswordAuthenticationToken(referenceId, password, authorityList);
           }else{
               throw new BadCredentialsException("Invalid Password");
           }
        }
        else{
            throw new BadCredentialsException("Invalid User, you must be register");
        }

    }




    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
