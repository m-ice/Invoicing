package com.ice.icetest;

import com.ice.beans.Person;
import com.ice.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class MainTest {
    @SuppressWarnings("resources")
    public static void main(String[] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean=applicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);

        for (String name:beanNamesForType){
            System.out.println(name);
        }
    }
}
