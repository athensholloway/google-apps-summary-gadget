package com.ditoweb.weeklyactivitysummary;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class WeeklyActivitySummaryApplication extends Application{
	
	@Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
        router.attachDefault(WeeklyActivitySummaryResource.class);
        router.attach("/oauth2/callback",OAuth2Resource.class);

        return router;
    }

}
