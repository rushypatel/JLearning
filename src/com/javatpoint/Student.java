package com.javatpoint;

public class Student {
private String name;
private String RollNumber;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRollNumber() {
	return RollNumber;
}

public void setRollNumber(String RollNumber) {
	this.RollNumber = RollNumber;
}

public void displayInfo(){
	System.out.println("Hello: "+name);
}
}
