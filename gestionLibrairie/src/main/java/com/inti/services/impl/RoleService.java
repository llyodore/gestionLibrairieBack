package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.library.entities.Role;
import com.inti.library.repositories.RoleRepository;
import com.inti.library.services.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long idRole) { 
		return roleRepository.findById(idRole).get();
	}

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void delete(Long idRole) {
		roleRepository.deleteById(idRole);
		
	}

	@Override
	public void update(Long idRole) {
		
		
	}

}
