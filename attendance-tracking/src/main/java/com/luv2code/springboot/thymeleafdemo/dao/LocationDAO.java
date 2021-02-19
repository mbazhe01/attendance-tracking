package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.entity.Location;

public interface LocationDAO {

	public List<Location> getLocations();

	public void saveLocation(Location theLocation);

	public Location getLocation(int theId);

	public void deleteLocation(int theId);
	
	public Location getDefaultLocation();
	
}
