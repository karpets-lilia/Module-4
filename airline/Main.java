package airline;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
  и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
  методами. Задать критерии выбора данных и вывести эти данные на консоль.
     Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     Найти и вывести:
     a) список рейсов для заданного пункта назначения;
     b) список рейсов для заданного дня недели;
     c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/
public class Main {
    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Minsk (MSQ)", new ArrayList<Airline>());

        flightSchedule.addAirline("Paris (SXF)", "B2 891", "Boeing 210 RJ-175",
                Airline.ft.parse("12:15"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Kiev (ZIA)", "B2 971", "Boeing 737-500",
                Airline.ft.parse("8:15"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Kiev (ZIA)", "B2 973", "Boeing 737-300",
                Airline.ft.parse("18:05"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Kiev (DME)", "B2 993", "Boeing 737-500",
                Airline.ft.parse("19:45"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                        DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});

        System.out.println("Список рейсов по направлению Рига (CRL):");
        ArrayList<Airline> airlinesToRiga = flightSchedule.airlinesToDestination("Riga (CRL)");
        for (Airline airline : airlinesToRiga) {
            System.out.println(airline);
        }

        System.out.println("\nСписок рейсов, вылетающих в воскресенье:");
        ArrayList<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }

        System.out.println("\nСписок рейсов, вылетающих после 13:00 вторника:");
        Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.MONDAY, time);
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}

