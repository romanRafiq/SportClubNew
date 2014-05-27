/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubnew.sportClub.app.confi;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.*;
/**
 *
 * @author Roman
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

   
  
    //Implement methods
      @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }
    
    @Override
    protected Class<?>[] getRootConfigClasses() 
    {
        return new Class<?>[]{
            ConnectionConfig.class
        };        
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
            WebMvcConfig.class
        };        
        
    }
      
     //extra methods
    @Override 
    protected Filter[] getServletFilters()
    {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        
        return new Filter[]{
            characterEncodingFilter};
     }
    
    
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("defaultHtmlEscape", "true");
        registration.setInitParameter("spring.profiles.active", "default");
    }
    
    
    
}
