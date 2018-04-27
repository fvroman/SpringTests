package hello;

public class BaseballCoach implements Coach{

    HappyFortuneService fortuneService;
    BaseballCoach(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private String team;
    @Override
    public String getDailyWorkout() {
        return "Baseball practice on";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
