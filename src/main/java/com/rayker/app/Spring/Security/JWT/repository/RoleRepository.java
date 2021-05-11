package com.rayker.app.Spring.Security.JWT.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rayker.app.Spring.Security.JWT.models.ERole;
import com.rayker.app.Spring.Security.JWT.models.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
