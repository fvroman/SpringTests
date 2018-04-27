package hello;

import org.springframework.stereotype.Component;

@Component
public class AnotherFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Another Fortune brah";
    }
}
