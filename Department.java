package org.department;

import org.college.College;

public class Department extends College{

	public void deptName()
	{
		System.out.println("department name:CSE/IT/ECE/EEE/ME");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Department dept=new Department();
dept.collegeName();
dept.collegeCode();
dept.collegeRank();
dept.deptName();
	}

}
