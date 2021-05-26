package airline;
import java.util.ArrayList;
import java.util.Date;

public class FlightSchedule {
    private String airportName;
    private ArrayList<Airline> airlines;

    FlightSchedule(String airportName, ArrayList<Airline> airline) {
        this.airportName = airportName;
        this.airlines = airline;
    }

    void addAirline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek[] dayOfWeek) {
        airlines.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
    }

    ArrayList<Airline> airlinesToDestination(String destination) {
        ArrayList<Airline> airLine = new ArrayList<>();
        for (Airline airline : this.airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    ArrayList<Airline> flightDays(DayOfWeek dayOfWeek) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    airlines.add(airline);
                    break;
                }
            }
        }
        return airlines;
    }

    ArrayList<Airline> flightDays(DayOfWeek dayOfWeek, Date departureTime) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    if (airline.getDepartureTime().compareTo(departureTime) >= 0) {
                        airlines.add(airline);
                        break;
                    }

                }
            }
        }
        return airlines;
    }
}





