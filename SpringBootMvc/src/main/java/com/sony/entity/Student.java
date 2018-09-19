package com.sony.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Student 
{
	@Min(value=0, message="cannot be negetive ")
	private int roll;
	private double marks;
	@Size(min=1,message="cannot be empty")
	private String sname;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", sname=" + sname + "]";
	}
}
