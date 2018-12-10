package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.WizzardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    void start() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizzardInterface myWizzard = context.getBean("wizzard", WizzardInterface.class);
        context.close();

        System.out.println("******************");
        System.out.println(myWizzard.giveAdvice());
        System.out.println("******************");
        //System.out.println(myWizzard.changeDress());
        //System.out.println("******************");
    }
}
