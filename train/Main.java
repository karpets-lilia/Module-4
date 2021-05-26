package train;
import java.text.ParseException;
import java.lang.String;

import static train.Train.*;


/*Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
        номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
        Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
        назначения должны быть упорядочены по времени отправления.*/
public class Main {
    public static void main(String[] args) throws ParseException {
        Train[] trains = new Train[5];
        trains[0] = new Train("Vien", "456", ft.parse("05:58"));
        trains[1] = new Train("Brest", "687", ft.parse("10:48"));
        trains[2] = new Train("Moskow", "931", ft.parse("13:15"));
        trains[3] = new Train("Berlin", "099", ft.parse("18:41"));
        trains[4] = new Train("Kiev", "133", ft.parse("06:40"));
        sortingTrainNumber(trains);

        for (Train train : trains) {
            System.out.println(train.trainNumber);
        }

        String request = "931";
        System.out.printf("%nTrain #%s, ", request);
        System.out.println(informationOfTrain(trains, request) + "\n");
        sortTrainDestinationName(trains);

        for (Train train : trains) {
            System.out.println(train.destinationName + " " + train.trainNumber + " - " + ft.format(train.departureTime));
        }
    }
}