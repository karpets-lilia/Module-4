package customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CustomerStorage client = new CustomerStorage("Clients", new ArrayList<>());
        client.addCustomer("Karpets", "Lilia", "Michailovna",
                "Brest", new BigInteger("1111111111111111"), 12343378);
        client.addCustomer("Ivanov", "Ivan", "Ivanovich",
                "Brest", new BigInteger("2222222222222222"), 43543378);
        client.addCustomer("Petrov", "Petr", "Petrovich",
                "Brest", new BigInteger("3333333333333333"), 38768378);

        System.out.println("Список покупателей в алфавитном порядке:");
        client.sortName();
        for (int i = 0; i < client.getBase().size(); i++) {
            System.out.println(client.getBase().get(i));
        }

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        ArrayList<Customer> list = client.getCustomerByCreditCardRange("2000000000000000", "3000000000000000");
        list.sort(Comparator.comparing(Customer::getCardNumber));
        if (list.size() == 0) {
            System.out.println("банковские карты не найдены");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
}


