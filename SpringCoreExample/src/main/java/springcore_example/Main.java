package springcore_example;

import org.springframework.context.ApplicationContext;

public class Main {
public static ApplicationContext Context;
public static void main(String)[] args) {
context= new ClassPathXmlApplicationContext("beans.xml");
HelloBean helloBean = (HelloBean) context.getBean("HelloBean");

helloBean.sayHello=();
}

