package zad6;

public enum Priority {

    LOWEST(5),
    LOW(4),
    MEDIUM(3),
    HIGH(2),
    HIGHEST(1);

    private int priorityNumber;

    Priority(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }
}
