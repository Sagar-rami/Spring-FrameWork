package it.sella.com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.sella.com.spring.service.CustomerService;

public class ClientApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_ApplicationContext.xml");
		CustomerService service = (CustomerService)context.getBean("csProxy");
		service.printName();
		service.printUrl();
		try {
			service.printException();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
