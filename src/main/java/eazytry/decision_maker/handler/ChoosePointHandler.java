package eazytry.decision_maker.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChoosePointHandler extends BaseHandler {
    private final List<String> points;
    private final Random random;

    public ChoosePointHandler() {
        this.points = new ArrayList<>();
        this.random = new Random();
    }

    @Override
    protected void handleNextString(String input) {
        points.add(input);
    }

    @Override
    protected String getResult() {
        return points.get(random.nextInt(0, points.size()));
    }

    @Override
    public String getName() {
        return HandlerNames.CHOOSE_POINT.getTitle();
    }

    @Override
    public String getWelcomeMessage() {
        return WelcomeMessages.CHOOSE_POINT.getMessage();
    }
}
