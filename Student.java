package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("name:Revathi");
	}
	public void studentDept()
	{
		System.out.println("Department:CSE");
	}
	public void studentId()
	{
		System.out.println("Id:12345");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st=new Student();
st.collegeName();
st.collegeCode();
st.collegeRank();
st.deptName();
st.studentName();
st.studentDept();
st.studentId();
	}

}
