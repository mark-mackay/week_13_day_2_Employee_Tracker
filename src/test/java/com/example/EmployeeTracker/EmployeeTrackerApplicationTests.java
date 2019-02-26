package com.example.EmployeeTracker;

import com.example.EmployeeTracker.models.Department;
import com.example.EmployeeTracker.models.Employee;
import com.example.EmployeeTracker.models.Project;
import com.example.EmployeeTracker.repositories.EmployeeRepository;
import com.example.EmployeeTracker.repositories.DepartmentRepository;
import com.example.EmployeeTracker.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Department marketing = new Department("Marketing");
		departmentRepository.save(marketing);

		Employee employee1 = new Employee("Mark", 46, 123456789, "mark@yahoo.com", marketing );
		Employee employee2 = new Employee("Slav", 41, 923456789, "slav@yahoo.com", marketing);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

		Project icarus = new Project("Icarus", 90);
		projectRepository.save(icarus);

		icarus.addEmployee(employee1);
		projectRepository.save(icarus);
	}

}
