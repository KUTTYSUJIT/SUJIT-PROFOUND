/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/ReflectionDemo.java
 *  Execution:    java -cp bin com.bridgelabz.util.ReflectionDemo
 *  
 *  Purpose: Reflection demo .
 *
 *  @author  Sujit Krishnankutty
 *  @version 1.0
 *  @since   11-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CityInfo{
	String cityName();
	String zip();
}

class ReflectionDemo{
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("Employee");
		Annotation[]annotation=c.getDeclaredAnnotations();
		for(Annotation ann: annotation){
			CityInfo info=(CityInfo)ann;
			System.out.println(info.cityName()+" "+info.zip());
		}
	}
}

@CityInfo(cityName="Mumbai", zip="400001")
class Employee{
	private int empId;
	private String empName;
	
	public Employee(){		
	}
	
	public Employee(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void getInfo(){
		System.out.println(empId+" "+empName);
	}
}