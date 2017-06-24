package br.com.MVC;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * 
 * @author Andeson
 * 
 * Essa classe substitui o famoso web XML
 *
 */

public class Application implements WebApplicationInitializer {

    // Contexto para gerenciar as configurações 
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("br.com.MVC.Config");
		
		//direciona para seus controladores e mapeia onde ele vai ouvir 
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(webApplicationContext));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/app/*");
		servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		
		
		
		
		
		
	}
	

}
