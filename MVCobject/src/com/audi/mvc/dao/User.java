package com.audi.mvc.dao;

import com.audi.mvc.dto.DataBean;

public interface User {
	
	//  access the user details  usignthe dao 
	public DataBean getDetails(int userid);

}
