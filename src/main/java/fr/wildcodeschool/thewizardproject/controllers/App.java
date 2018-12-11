package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.WizzardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    void start() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizzardInterface myWizzardD = context.getBean("dumbledore", WizzardInterface.class);
        System.out.println("******************");
        System.out.println(myWizzardD.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizzardD.changeDress());
        System.out.println("******************");

        WizzardInterface myWizzardG = context.getBean("gandalf", WizzardInterface.class);
        System.out.println("******************");
        System.out.println(myWizzardG.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizzardG.changeDress());
        System.out.println("******************");

        context.close();
    }
}
