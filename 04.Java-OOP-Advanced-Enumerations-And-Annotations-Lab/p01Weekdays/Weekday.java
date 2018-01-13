package p01Weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        return super.name().substring(0,1) + super.name().toLowerCase().substring(1);
    }
}
