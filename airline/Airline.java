package airline;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String destination;
    private String flightNumber;
    private String aircraftType;
    private Date departureTime;
    private DayOfWeek[] dayOfWeek;

    public static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    Airline(String destination, String flightNumber, String aircraftType, Date departureTime, DayOfWeek[] dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (DayOfWeek day : dayOfWeek) {
            strBuilder.append(day);
            strBuilder.append(", ");
        }
        return String.format("Destination: %s, Flight number: %s, Aircraft type: %s," +
                        " Departure time: %s, Days of the week: %s\b\b.",
                destination, flightNumber, aircraftType, ft.format(departureTime), strBuilder.toString());
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return String.valueOf(flightNumber);
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

