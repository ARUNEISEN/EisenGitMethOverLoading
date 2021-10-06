package com.stu;

public class StuDetails extends Method_OverLoading {
	
	public void stuId() {
		System.out.println("student id is 5654545");
	}
	public void stuMobno() {
		System.out.println("student mobno is 9764554556");
	}
	public void stuName() {
		System.out.println("student name is ARUKUMAR S");
	}

	public static void main(String[] args) {
		StuDetails s=new StuDetails();
		s.stuDetails(454343);
		s.stuDetails(9754545456L);
		s.stuDetails("HARIHARAN", 'K');
		s.stuId();
		s.stuMobno();
		s.stuName();

	}

}
