package com.javatpoint;

public class Student {
private int Id;
private String TypeDivision;
private String division;
private String name;
private String RollNumber;
private String LastName;
// Put Comment
public int getId() {
	return Id;
}
// put comment in setter
public void setId(int Id) {
	this.Id = Id;
}

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

public void displayName(){
	System.out.println("displayName: "+name);
}
}
