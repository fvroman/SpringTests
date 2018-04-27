package hello;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Good Fortune brah";
    }
}
