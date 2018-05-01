package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("anotherFortuneService")
    FortuneService fortuneService;
    public String getDailyWorkout() {
        return "Tennis !) PLAY!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void init() {
        System.out.println("I am created and ready to serve");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("I am totally killed sorry bro no tennis here");
    }

}
