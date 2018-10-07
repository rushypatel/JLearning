package com.javatpoint;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Student student=(Student)factory.getBean("studentbean");
	student.displayInfo();
	Short sObj2 = new Short("10");
	   
    //print value of Short objects
    //System.out.println(sObj1);
    System.out.println(sObj2);
    
    Set<Short> set = new HashSet<Short>();
    for(short i=0;i<10;i++){
    	System.out.println(">>>"+i);
    	set.add(i);
    	set.remove(i-1);
    }
    System.out.println(">>>>>>>>>>>>>>>>>"+set.size());
    
    //Version 2
    student.displayInfo();
	}
	
	// This line added by 11111
}
