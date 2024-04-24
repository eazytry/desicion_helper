package eazytry.decision_maker.handler;

public class HandleResult {
    private final Status status;

    public HandleResult(Status status) {
        this.status = status;
    }

    public boolean isFinished() {
        return Status.RETURN.equals(status);
    }
}
