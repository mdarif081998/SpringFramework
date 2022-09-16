package com.md;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.dao.EmployeeDao;
import com.md.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/md/config.xml");
		/*// inserting Directly without following design pattern
		 * JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		 * String sql= "insert into Employee values(?,?,?)"; int
		 * result=jdbcTemplate.update(sql, new Integer(1), "MD ARIF", new Integer(24));
		 * System.out.println("Number of records inserted are: "+ result);
		 */
        
        EmployeeDao dao = (EmployeeDao) context.getBean("employeeDaoImpl");
        Employee emp = new Employee();
		/*
		 * // Inserting Record through EmployeeDaoImpl class 
		 * emp.setId(2);
		 * emp.setName("Partha"); 
		 * emp.setAge(25); 
		 * int res = dao.insert(emp);
		 * System.out.println("Number of Records Inserted are: " + res);
		 */
		/*
		 * //updating record 
		 * emp.setId(1); 
		 * emp.setName("Subbu"); 
		 * emp.setAge(23); 
		 * int res= dao.update(emp);
		 * System.out.println("Number of Records Updated are: " + res);
		 */
        
		/*
		 * //Delete Record 
		 * int res= dao.delete(1);
		 * System.out.println("Number of Records Deleted are: " + res);
		 */
        
		/*
		 * //Read single Object 
		 * Employee emp1= dao.readById(1);
		 * System.out.println(emp1.toString());
		 */
        
        //Reading All Records of Employee Table
        List<Employee> res=dao.readAll();
        System.out.println(res);
    }
}
