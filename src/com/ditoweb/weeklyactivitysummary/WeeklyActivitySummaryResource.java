package com.ditoweb.weeklyactivitysummary;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class WeeklyActivitySummaryResource extends ServerResource {

	
	@Get
	public String getWeeklyActivitySummary(){
		return "weekly-activity-summary!";
	}
}
