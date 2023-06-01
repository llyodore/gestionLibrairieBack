package com.inti.library.services.interfaces;

import java.util.List;

import com.inti.library.entities.Role;

public interface IRoleService {
	List<Role> findAll();
	
	Role findOne(Long idRole);
	
	Role save (Role role);
	
	void delete (Long idRole);
	
	void update (Long idRole);

}
