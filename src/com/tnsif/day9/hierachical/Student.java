package com.tnsif.day9.hierachical;

public class Student extends person {
	private String srn;
	private String branch;
	public Student() {
		super();
	}
	public Student(String srn, String branch,String name, String address) {
		super(name,address);
		this.srn = srn;
		this.branch = branch;
	}
	public String getSrn() {
		return srn;
	}
	public void setSrn(String srn) {
		this.srn = srn;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [srn=" + srn + ", branch=" + branch + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
																											
	

}
