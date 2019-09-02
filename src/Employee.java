import java.util.*;

public class Employee implements Comparable<Employee>{

	private int empno;
	private String ename;
	private int salary;
	private String designation;
	private String dept;
	
	
	public Employee(int empno, String ename, int salary, String designation, String dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", dept=" + dept + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee emp) {
		
		return this.getEmpno()-emp.getEmpno();
	}

	
	
}