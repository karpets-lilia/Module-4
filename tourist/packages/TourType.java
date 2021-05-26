package tourist.packages;

public enum TourType {
    RECREATION ( Transport.PLANE, TourPeriod.ONE_WEEK, TypeOfFood.ONLY_BREAKFAST),
    EXCURSION ( Transport.BUS, TourPeriod.ONE_WEEK, TypeOfFood.ALL_INCLUSIVE),
    TREATMENT ( Transport.BUS, TourPeriod.ONE_WEEK, TypeOfFood.ALL_INCLUSIVE),
    SHOPPING ( Transport.PLANE, TourPeriod.ONE_DAY, TypeOfFood.NOT_INCLUDED),
    CRUISE ( Transport.SHIP, TourPeriod.ONE_MONTH, TypeOfFood.ALL_INCLUSIVE);

    public Transport transport;
    public TourPeriod period;
    public TypeOfFood food;

    TourType(Transport transport, TourPeriod period, TypeOfFood food) {
        this.transport = transport;
        this.period = period;
        this.food = food;
    }
}


