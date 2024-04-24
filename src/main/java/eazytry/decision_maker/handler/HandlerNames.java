package eazytry.decision_maker.handler;

public enum HandlerNames {
    CHOOSE_POINT("Выбрать пункт из списка"),
    YES_OR_NO("Да или Нет?"),
    ADVICE("Получить совет на день"),
    DAILY_PREDICTION("Получить предсказание на день");

    private final String title;

    HandlerNames(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
