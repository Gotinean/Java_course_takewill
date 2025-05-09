package homework2.enums;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }
    }