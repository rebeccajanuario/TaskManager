package com.exemplo.todolist.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

  @SuppressWarnings("deprecation")
    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return new ProviderManager(java.util.List.of(new DaoAuthenticationProvider()));
    }


  // Em: src/main/java/com/exemplo/todolist/security/SecurityConfig.java

@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            // PERMITE ACESSO PÚBLICO A ESTAS ROTAS:
            .requestMatchers(
                "/auth/**",      // API de autenticação
                "/css/**",       // Arquivos de estilo (CSS)
                "/",             // Página inicial (sua lista de tarefas)
                "/tasks/**"      // Todas as páginas de tarefas (nova, editar, deletar)
            ).permitAll()
            
            // PROTEGE O RESTO (neste caso, a API que não vamos usar agora)
            .anyRequest().authenticated()
        )
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

    http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

    return http.build();
}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
