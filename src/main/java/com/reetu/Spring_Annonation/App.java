package com.reetu.Spring_Annonation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reetu.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new AnnotationConfigApplicationContext(BeanConfig.class);
    	Employee e1=ctx.getBean(Employee.class);
    	e1.setName("Ram Kumar");
    	e1.setSalary(98000);
    	e1.getAddress().setCity("Noida");
    	e1.getAddress().setState("UP");
    	System.out.println(e1.getName());
    	System.out.println(e1.getSalary());
    	System.out.println(e1.getAddress().getCity());
    	System.out.println(e1.getAddress().getState());
    	
    	Employee e2=ctx.getBean(Employee.class);
    	System.out.println(e2.getName());
    	System.out.println(e2.getSalary());
    	System.out.println(e2.getAddress().getCity());
    	System.out.println(e2.getAddress().getState());
    	
    	
    }
}
