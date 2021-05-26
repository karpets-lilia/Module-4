package train;

import java.text.SimpleDateFormat;
import java.util.Date;


/*Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,
 время  отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность
 сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
 номер которого введен пользователем. Добавьте  возможность  сортировки  массива  по  пункту
 назначения,  причем  поезда  с  одинаковыми  пунктами назначения должны быть упорядочены по
 времени отправления.*/
 public class Train {
     String destinationName;
     String trainNumber;
     Date departureTime;

    public static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    Train(String destinationName, String trainNumber, Date departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

   public static void sortingTrainNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].trainNumber.compareTo(trains[j].trainNumber) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    public static void sortTrainDestinationName(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].destinationName.compareTo(trains[j].destinationName);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[j].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    public static String informationOfTrain(Train[] trains, String trainNumber) {
        for (Train train : trains) {
            if (train.trainNumber.equalsIgnoreCase(trainNumber)) {
                return "\n" +
                        "Название пункта назначения: " + train.destinationName +
                        ", время отправления: " + ft.format(train.departureTime);
            }
        }
        return null;
    }
}
