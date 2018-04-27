package hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
       /* LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        Coach coach = new BaseballCoach();
        Coach footballCoach = new FootballCoach();
        List<Coach> coachList = Arrays.asList(coach, footballCoach);
        for (Coach c : coachList) {
            System.out.println(c.getDailyWorkout());
        }*/
       //Load Spring Configuration File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve Bean
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //System.out.println(theCoach.getTeam());
        //Close context
        context.close();
    }
}