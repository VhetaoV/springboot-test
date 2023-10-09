package com.example.springboottest.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: chenliang
 * @create: 2023-10-09 14:29
 **/
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------开始调用CommandLineRunner------------");
        for (String arg:args){
            System.out.println("  "+arg);
        }
        System.out.println("++++++++++++结束调用CommandLineRunner++++++++++++");
    }
}