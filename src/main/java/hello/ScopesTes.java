package hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

/**
 * Created by Roman on 27.04.2018.
 */
public class ScopesTes {
    public static void main(String[] args) {
        //load config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Those are singletons
        Coach oneCoach = context.getBean("tennisCoach", Coach.class);

        Coach anotherCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(oneCoach == anotherCoach);

        // Those are prototypes

        //Coach footballCoach = context.getBean("footballCoach", Coach.class);

       //Coach goodFootballCoach = context.getBean("footballCoach", Coach.class);

       // System.out.println(footballCoach == goodFootballCoach);

        context.close();

    }
}
