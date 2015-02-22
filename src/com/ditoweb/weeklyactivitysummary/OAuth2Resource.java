package com.ditoweb.weeklyactivitysummary;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
//import org.restlet.ext.servlet.ServletUtils;


public class OAuth2Resource  extends ServerResource {
	
	@Get
	public String onCallback(){
		//HttpServletRequest request = ServletUtils.getRequest(getRequest());
		
		return "oauth2 callback";
	}

}
