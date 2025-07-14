package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("resources.xml");

        Student s=(Student)context.getBean("student");
        s.show();

        Internship i=(Internship)context.getBean("internship");
        i.display();

        Report r=(Report)context.getBean("report");
        r.viewreport();
    }
}
