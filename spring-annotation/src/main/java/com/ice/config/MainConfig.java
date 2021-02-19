package com.ice.config;

import com.ice.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lucky_ice
：****
 * 版本：version 1.0
 */
//配置类==配置文件
@Configuration //告诉spring这是一个配置类
public class MainConfig {
    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person")
    public Person person01(){
        return new Person("马兵",25);
    }
}
