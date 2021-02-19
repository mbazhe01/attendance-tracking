package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.thymeleafdemo.entity.Department;
import com.luv2code.springboot.thymeleafdemo.entity.Location;
import com.luv2code.springboot.thymeleafdemo.service.DepartmentService;
import com.luv2code.springboot.thymeleafdemo.service.LocationService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

	private DepartmentService departmentService;
	
	@Autowired
	public DepartmentController(@Qualifier("departmentServiceImpl") DepartmentService theService) {
		departmentService = theService;
	}
	
	// add mapping 
	@GetMapping("/list")
	public String getDepartments(Model theModel) {
			
		List<Department> theDepartments = departmentService.findAll();
			
		theModel.addAttribute("departments", theDepartments);
			return "departments/list-departments";
			
	}
	
	// add department
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
			
		Department theDepartment = new Department();
			
		theModel.addAttribute("department", theDepartment);
		return "departments/department-form";
			
	}
	
	// save department
	@PostMapping("/save")
	public String saveEmployee( @ModelAttribute("department") Department theDepartment) {
				
		departmentService.save(theDepartment);
			
		return "redirect:/departments/list";
				
	}
	
	// update department
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("departmentId") int theId,
			Model theModel) {
			
			Department theDepartment = departmentService.findById(theId);
				
				theModel.addAttribute("department", theDepartment);
				return "departments/department-form";
				
	}
	
	// delete department
	@GetMapping("/delete")
	public String delete(@RequestParam("departmentId") int theId) {
				
		departmentService.deleteById(theId);
			
		return "redirect:/departments/list";
				
	}
	
}

