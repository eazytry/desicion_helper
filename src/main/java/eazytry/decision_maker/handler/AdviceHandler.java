package eazytry.decision_maker.handler;

public class AdviceHandler extends NoIteractionsHandler {
    private static final String DEFAULT_ADVICE = "Отсутствие желаемого результата отражает лишь недостаточное количество приложенных усилий. Попытайся еще раз.";
    @Override
    protected String getResult() {
        return DEFAULT_ADVICE;
    }

    @Override
    public String getName() {
        return HandlerNames.ADVICE.getTitle();
    }

    @Override
    public String getWelcomeMessage() {
        return WelcomeMessages.ADVICE.getMessage();
    }
}
