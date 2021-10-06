package com.stu;

public class Semester_Results {
	
	public void firstSem(int maths) {
		System.out.println("mathematics:"+maths);
	}
	public void firstSem(long regNo ) {
		System.out.println("registration no:"+regNo);
	}
	public void firstSem(float cgpa) {
		System.out.println("CGPA:"+cgpa);
	}
	public void firstSem(String name,char initial) {
		System.out.println("student name:"+name+" "+initial);
	}
	public void firstSem(Long mobNo) {
		System.out.println("student mobNo:"+mobNo);
	}

	public static void main(String[] args) {
	
		Semester_Results s=new Semester_Results();
	    s.firstSem(89);
		s.firstSem(20095565676L);
		s.firstSem(7.91f);
		s.firstSem("ARUNKUMAR",'S');
		s.firstSem(9750824876L);
		

	}

}
