package hello;

public class FootballCoach implements Coach {
    FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Football workout on";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
