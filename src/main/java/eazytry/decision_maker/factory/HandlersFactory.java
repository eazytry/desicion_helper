package eazytry.decision_maker.factory;

import eazytry.decision_maker.handler.AdviceHandler;
import eazytry.decision_maker.handler.DailyPredictionHandler;
import eazytry.decision_maker.handler.Handler;
import eazytry.decision_maker.handler.ChoosePointHandler;
import eazytry.decision_maker.handler.YesOrNoHandler;

import java.util.List;

public class HandlersFactory {
    private HandlersFactory() {
    }

    public static List<Handler> getHandlers() {
        return List.of(
                new ChoosePointHandler(),
                new YesOrNoHandler(),
                new DailyPredictionHandler(),
                new AdviceHandler()
        );
    }
}
