package com.stu;

public class Method_OverLoading {
	
	public void stuDetails(int stuId) {
		System.out.println("studentId:"+stuId);
	}
	
	public void stuDetails(long mobno) {
		System.out.println("student mobno:"+mobno);
	}
	
   public void stuDetails(String name,char initial) {
	System.out.println("student name :"+ name+" " + initial);
   }
	
	
	

}
