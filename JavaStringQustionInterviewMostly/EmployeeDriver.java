package com.str;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
			
		empList.add(new Employee(1, "A", 30, "F", 20000));
		empList.add(new Employee(2, "B", 20, "M", 25000));
		empList.add(new Employee(3, "C", 33, "M", 30000));
		empList.add(new Employee(4, "D", 35, "F", 22000));
		empList.add(new Employee(5, "E", 25, "F", 40000));
		
		empList.forEach(e->
		System.out.println("ID "+e.getEmpId()+" Name "+e.getEmpName()+" Age "+e.getEmpage()+" Gender "+e.getEmpGender()+" Salary "+e.getEmpSalar()));
	
		Map<String,Long> m=empList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting() ));
		
		System.out.println(m);
		
		Map<String,Double> m2=empList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpSalar)));
		System.out.println(m2);
		
		List<Employee> e=empList.stream()
		.sorted(Comparator.comparing(Employee::getEmpage)).collect(Collectors.toList());
		
		e.forEach(i->
		System.out.println("ID "+i.getEmpId()+" Name "+i.getEmpName()+" Age "+i.getEmpage()+" Gender "+i.getEmpGender()+" Salary "+i.getEmpSalar()));
	}

}
