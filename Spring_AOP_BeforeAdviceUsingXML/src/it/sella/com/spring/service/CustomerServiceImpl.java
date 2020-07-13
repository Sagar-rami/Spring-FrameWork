package it.sella.com.spring.service;

public class CustomerServiceImpl implements CustomerService{

	private String name;
	private String url;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String printName() {
		System.out.println("\n-----------------------------------------------------");
		System.out.println("Business Method:getName()=>"+name);
		return name;
	}

	@Override
	public String printUrl() {
		System.out.println("\n -----------------------------------------------------");
		System.out.println("Business Method:getUrl()=>"+url);
		return url;
	}

	@Override
	public void printException() {
		throw new IllegalArgumentException("Custom Exception");		
	}

}
