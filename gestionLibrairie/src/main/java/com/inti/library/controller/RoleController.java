package com.inti.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.library.entities.Role;
import com.inti.library.services.interfaces.IRoleService;



@RestController // RestFul ws
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	@RequestMapping(value="roles", method = RequestMethod.GET)
	public List<Role>findAll(){
		return roleService.findAll();
	}
	
	@RequestMapping(value="roles", method=RequestMethod.GET)
	public Role findOne(Long idRole) {
		return roleService.findOne(idRole);
	}
	
	@RequestMapping(value = "roles", method = RequestMethod.POST)
		public Role saveRole(@RequestBody Role role) {
			return roleService.save(role);
		}
			
	@RequestMapping (value ="roles",method = RequestMethod.DELETE)
		public void deleteRole(Long idRole) {
			roleService.delete(idRole);
	}
	
	@RequestMapping(value="roles", method=RequestMethod.PUT)
	public Role updateRole (Long idRole, Role role) {
		Role currentRole = roleService.findOne(idRole);
		currentRole.setIdRole(role.getIdRole());
		currentRole.setLibelle(role.getLibelle());
		return roleService.save(currentRole);
	}
}
