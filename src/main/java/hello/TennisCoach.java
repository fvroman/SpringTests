package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

}
