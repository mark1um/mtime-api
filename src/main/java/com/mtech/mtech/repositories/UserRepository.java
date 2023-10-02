package com.mtech.mtech.repositories;

import com.mtech.mtech.domain.atividade.Atividade;
import com.mtech.mtech.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}