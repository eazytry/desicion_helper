package eazytry.decision_maker.handler;

import java.util.List;
import java.util.Random;

public class YesOrNoHandler extends NoIteractionsHandler {
    private static final String YES = "Да";
    private static final String NO = "Нет";

    private final List<String> answers;
    private final Random random;

    public YesOrNoHandler() {
        this.answers = List.of(YES, NO);
        this.random = new Random();
    }

    @Override
    protected String getResult() {
        return answers.get(random.nextInt(0, answers.size()));
    }

    @Override
    public String getName() {
        return HandlerNames.YES_OR_NO.getTitle();
    }

    @Override
    public String getWelcomeMessage() {
        return WelcomeMessages.YES_OR_NO.getMessage();
    }
}
