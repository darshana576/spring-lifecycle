package com.lifecycle;
import com.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class testter {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        samosa temp = (samosa) context.getBean("s1");
        System.out.println(temp);
        context.registerShutdownHook();
        System.out.println("==============");
        pepsi s2=(pepsi)context.getBean("s2");
        System.out.println(s2);

    }
}
