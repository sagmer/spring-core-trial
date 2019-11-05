package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Greeter greeter = (Greeter) context.getBean("greeter2");
        System.out.println(greeter.greet());
    }
}
