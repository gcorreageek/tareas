package com.polla.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService 
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class PollaImpl     {

	@WebMethod(operationName = "sayHello")
	public String saluda(@WebParam(name="guestname") String guestname) {
		if(guestname==null){
            return "Hello";
        }
        return "Hello "+ guestname;
	}
	
	
}
