/**
 * 
 */
package com.spk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Praveen
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.spk.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

}
