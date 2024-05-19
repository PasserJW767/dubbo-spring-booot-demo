package org.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Task implements CommandLineRunner {

    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        String s = demoService.sayHello();
        System.out.println("Receive Result: ====> " + s);

        new Thread(() -> {
            while (true){
                try{
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive Result: ====> " + demoService.sayHello());
                } catch (InterruptedException e){
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}
