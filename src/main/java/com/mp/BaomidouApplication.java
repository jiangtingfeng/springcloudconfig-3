package com.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*扫描dao层中的mapper*/
@MapperScan("com.mp.dao")
public class BaomidouApplication {
    public static void main (String args[]) {
        SpringApplication.run(BaomidouApplication.class,args);
    }
}
