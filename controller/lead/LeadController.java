package com.mss.Inventory.controller.lead;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mss.Inventory.entity.Project;
import com.mss.Inventory.entity.Users;
import com.mss.Inventory.repository.LeadRepository;
import com.mss.Inventory.repository.UserRepository;

@RestController

public class LeadController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	LeadRepository leadRepository;
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<Users> getAllUsers() {
	  return userRepository.findAll();
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public List<Project> getAllLeads() {
	  return leadRepository.findAll();
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Project createLead(@Valid @RequestBody Project project) {
	  project.setProjectId(project.getProjectId());
	  leadRepository.save(project);
	  return project;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Users getUserById(@PathVariable("id") String id) {
	  return userRepository.findByid(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyUserById(@PathVariable("id") String id, @Valid @RequestBody Users users) {
	  users.setId(id);
	  userRepository.save(users);
	}
	/*@RequestMapping(value = "/", method = RequestMethod.POST)
	public Users createUser(@Valid @RequestBody Users users) {
	  users.setId(users.getId());
	  userRepository.save(users);
	  return users;
	}*/
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id) {
	  userRepository.delete(userRepository.findByid(id));
	}
}