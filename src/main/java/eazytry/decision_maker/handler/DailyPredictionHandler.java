package eazytry.decision_maker.handler;

public class DailyPredictionHandler extends NoIteractionsHandler {
    private static final String DEFAULT_DAILY_PREDICTION = "Сегодня не будет апокалипсиса.";
    @Override
    protected String getResult() {
        return DEFAULT_DAILY_PREDICTION;
    }

    @Override
    public String getName() {
        return HandlerNames.DAILY_PREDICTION.getTitle();
    }

    @Override
    public String getWelcomeMessage() {
        return WelcomeMessages.DAILY_PREDICTION.getMessage();
    }
}
