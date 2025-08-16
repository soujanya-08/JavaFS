package com.wipro2.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro2.springdemo.beans.College;
import com.wipro2.springdemo.beans.Department;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Department dep = ctx.getBean(Department.class);
//        dep.setDeptCode("CS150");
//        dep.setDeptName("CSE");
        System.out.println(dep);
        College clg = ctx.getBean(College.class);
        System.out.println(clg);
        
    }
}
