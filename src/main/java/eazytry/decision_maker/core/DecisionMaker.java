package eazytry.decision_maker.core;

import eazytry.decision_maker.handler.HandleResult;
import eazytry.decision_maker.handler.Handler;

import java.io.IOException;
import java.util.Scanner;

public class DecisionMaker {
    private static final HandlersContext context = new HandlersContext();
    private static Handler currentHandler;
    private static HandleResult currentHandlerResult;

    private DecisionMaker() {
    }

    public static void start() throws IOException {
        var scanner = new Scanner(System.in);
        String inputData = null;

        while (!SystemCommands.EXIT.toString().equalsIgnoreCase(inputData)) {
            if (currentHandler != null && currentHandlerResult != null && currentHandlerResult.isFinished()) {
                currentHandler.printResult(System.out);
                currentHandler = null;
                currentHandlerResult = null;
                inputData = null;
                continue;
            }
            if (currentHandler == null && inputData != null) {
                currentHandler = context.getHandler(Integer.parseInt(inputData));
                currentHandler.printWelcomeMessage(System.out);
                continue;
            }
            if (currentHandler == null) {
                context.printHandlers(System.out);
                inputData = scanner.nextLine();
                continue;
            }
            inputData = scanner.nextLine();
            currentHandlerResult = currentHandler.handle(inputData);
        }
    }
}
