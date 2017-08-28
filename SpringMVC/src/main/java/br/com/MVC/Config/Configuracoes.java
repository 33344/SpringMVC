package br.com.MVC.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 
 * @author Anderson
 * classe de configuração e busca de xml 
 *
 */

@EnableWebMvc
@Configuration
//procura as annotetions 
@ComponentScan(basePackages="br.com.MVC") 
public class Configuracoes extends WebMvcConfigurerAdapter {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		UrlBasedViewResolver basedViewResolver = new UrlBasedViewResolver();
		basedViewResolver.setPrefix("/WEB-INF/");
		basedViewResolver.setSuffix(".html");
		basedViewResolver.setViewClass(JstlView.class);
		registry.viewResolver(basedViewResolver);
		
		
		
		
		
		
	}
}
