package com.inti.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.library.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
