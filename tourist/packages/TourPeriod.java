package tourist.packages;

public enum TourPeriod {
    ONE_DAY ("One day"),
    ONE_WEEK ("One week"),
    ONE_MONTH ("One month");

    private String periodType;

    TourPeriod(String periodType) {
        this.periodType = periodType;
    }
}
