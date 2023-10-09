package com.example.springboottest.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @description:
 * @author: chenliang
 * @create: 2023-10-09 14:31
 **/
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("------------开始调用ApplicationRunner------------");
        String[] sourceArgs = args.getSourceArgs();
        for (String arg:sourceArgs){
            System.out.println("  "+arg);
        }
        System.out.println("  -----------------option----------------    ");
        Set<String> optionNames = args.getOptionNames();
        for (String s: optionNames) {
            System.out.println("  optionName:"+s+"  optionValue:"+args.getOptionValues(s));
        }

        System.out.println("++++++++++++结束调用ApplicationRunner++++++++++++");
    }
}