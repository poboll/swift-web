package com.caiths.swiftweb.config;

import com.caiths.swiftweb.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author poboll
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class,})
public class MyAutoConfiguration {
}