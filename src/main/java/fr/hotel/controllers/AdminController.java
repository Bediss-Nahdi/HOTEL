package fr.hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.hotel.services.AdminService;



public class AdminController  {

	
	@Autowired
	AdminService adminService;
	@RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
	public AdminService getUserByUsername(@PathVariable("username") String username) {
		return (AdminService) adminService.findByUsername(username);
	}
}
