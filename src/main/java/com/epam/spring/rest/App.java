package com.epam.spring.rest;

import com.epam.spring.rest.configuration.MyConfig;
import com.epam.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);

//        Employee emp = new Employee("Sveta", "Smornova",
//                "IT", 1900);
//        emp.setId(10);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(10);
    }
}
