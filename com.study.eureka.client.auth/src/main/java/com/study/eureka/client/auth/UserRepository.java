package com.study.eureka.client.auth;

import com.study.eureka.client.auth.core.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
