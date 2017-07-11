package org.liang;

public class Test {

	public String name;
	public int id;
	
	public Test(int id,String name){
		this.name = name;
		this.id = id;
	}
	
	public Test(){
		
	}
	
	public void print(){
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}
}
