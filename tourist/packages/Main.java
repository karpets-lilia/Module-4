package tourist.packages;
import java.util.ArrayList;
import java.util.Scanner;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose transport type:\n" +
                "0 - Plane\n" +
                "1 - Bus\n" +
                "2 - Ship"
        );
        Scanner scannerTransport = new Scanner(System.in);
        int transportType = scannerTransport.nextInt();

        System.out.println("Choose period type:\n" +
                "0 - One day\n" +
                "1 - One week\n" +
                "2 - One month"
        );
        Scanner scannerPeriod = new Scanner(System.in);
        int periodType = scannerPeriod.nextInt();

        System.out.println(
                "Choose food type:\n" +
                        "0 - Not included\n" +
                        "1 - Only Breakfast\n" +
                        "2 - All inclusive"
        );
        Scanner scannerFood = new Scanner(System.in);
        int foodType = scannerFood.nextInt();

        Transport transport = Transport.values()[transportType];
        TourPeriod period = TourPeriod.values()[periodType];
        TypeOfFood food = TypeOfFood.values()[foodType];

        ArrayList<TourType> availableTours = new ArrayList<TourType>();
        for (TourType tour : TourType.values()) {
            if (tour.transport == transport && tour.period == period && tour.food == food) {
                availableTours.add(tour);
            }
        }

        if (availableTours.isEmpty()) {
            System.out.println("По вашим критериям ничего не найдено");
        } else {
            System.out.println("Доступные туры:");
            System.out.println(availableTours.toString());
        }
    }
}
