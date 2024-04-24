package eazytry.decision_maker.handler;

public enum WelcomeMessages {
    YES_OR_NO("Нажмите Enter для получения ответа"),
    CHOOSE_POINT("Вводите пункты построчно, а далее, нажмите Enter для получения выбранного пункта"),
    ADVICE("Нажмите Enter для получения совета"),
    DAILY_PREDICTION("Нажмите Enter для получения предсказания");

    private final String message;

    WelcomeMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
