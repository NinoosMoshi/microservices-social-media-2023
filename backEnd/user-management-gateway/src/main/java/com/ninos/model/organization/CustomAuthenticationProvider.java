package com.ninos.model.organization;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ninos.organizationrole.OrganizationRole;
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
//               List<SimpleGrantedAuthority> organizationRoles = organization.get().getRoles().stream().map(role ->{
//                   return new SimpleGrantedAuthority(role.getRoles().getCode());
//               }).collect(Collectors.toList());

               return new UsernamePasswordAuthenticationToken(referenceId, password, toSimpleGrantedAuthority(organization.get().getRoles()));
           }
        }
        return null;

    }




    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }



      private List<SimpleGrantedAuthority> toSimpleGrantedAuthority(List<OrganizationRole> organizationRoles){
          List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();

          for (OrganizationRole organizationRole: organizationRoles){
              simpleGrantedAuthorities.add( new SimpleGrantedAuthority(organizationRole.getRoles().getCode()) );
          }
          return simpleGrantedAuthorities;
      }




}
