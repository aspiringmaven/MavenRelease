package me.sumitkawatra.mavenrelease.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 
 * @author Sumit Kawatra
 *
 */
public class ApplicationContext implements ServletContextListener {

	private static final String DEVELOPER = "developer";
	
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println(servletContextEvent.getServletContext().getInitParameter(ApplicationContext.DEVELOPER));

	}

}
