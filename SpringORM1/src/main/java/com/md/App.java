package com.md;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.dao.CustomerDao;
import com.md.entity.Customer;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Spring ORM Project");
		System.out.println("Please Follow the below instructions");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/md/config.xml");
		CustomerDao dao = (CustomerDao) context.getBean("customerDaoImpl");
		boolean wish = true;
		while (wish) {
			System.out.println("Enter: 1 for Inserting data, 2 for Updating, 3 for Deleting, ");
			System.out.println("4 for Reading data by Id, 5 for Reading All Entries, 6 for Exit.");
			Customer customer = new Customer();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Integer type Customer Id");
				customer.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Customer Full Name");
				customer.setName(sc.nextLine());
				System.out.println("Enter Customer Age");
				customer.setAge(sc.nextInt());
				int res = dao.insert(customer);
				System.out.println("Data Inserted Successfully");

				break;
			case 2:
				System.out.println("Enter Integer type Customer Id");
				customer.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Customer Full Name");
				customer.setName(sc.nextLine());
				System.out.println("Enter Customer Age");
				customer.setAge(sc.nextInt());
				dao.update(customer);
				System.out.println("Data Updated Successfully");
				break;
			case 3:
				System.out.println("Enter Integer type Customer Id");
				dao.delete(sc.nextInt());
				System.out.println("Data deleted");
				break;
			case 4:
				System.out.println("Enter Integer type Customer Id");
				Customer cust3 = dao.find(sc.nextInt());
				System.out.println(cust3.toString());

				break;
			case 5:
				List<Customer> customerList = dao.findAll();
				System.out.println(customerList);
				break;
			case 6:
				wish = false;
				System.out.println("Thank you, Visit Again...");
				break;
			default:
				System.out.println("Please Try Again...");
				break;
			}
		}

	}
}
