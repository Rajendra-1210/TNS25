package com.tnsif.day9.hierachical;

public class Employee extends person{
	private String dept;
	private String salary;
	public Employee() {
		super();
	}
	public Employee(String dept, String salary,String name, String address) {
		super(name,address);
		this.dept = dept;
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	

}
