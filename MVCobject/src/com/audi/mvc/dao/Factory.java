package com.audi.mvc.dao;

// it gives the reference variable of the User interface in which the jdbc dao is stored 
public class Factory {

	public static User getUser() {
		
	 try {
		return  (User) Class.forName("com.audi.mvc.dao.UserDetails").newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
		
	}
	
	
}
