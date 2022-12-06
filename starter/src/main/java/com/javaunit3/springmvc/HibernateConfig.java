package com.javaunit3.springmvc;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig
{
    @Bean
    public SessionFactory getFactory() {
        SessionFactory factory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.javaunit3.springmvc.MovieEntity.class)
                .addAnnotatedClass(com.javaunit3.springmvc.VoteEntity.class)
                .buildSessionFactory();

        return factory;
    }
}