package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testmetric {
    @GetMapping("/metric")
    public static String home(){
        return "Hello Metrics World!";
    }

    @GetMapping("/cpu")
    public String user(){
        try{
            int f=10;
            while(f>0){
                Runnable r=() ->{
                    while(true){

                    }
                };

                new Thread(r).start();
                Thread.sleep(5000);
                f--;
            }
        }catch (Exception e){}
        return "Hello World!";
    }
}
