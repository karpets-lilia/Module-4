package customer;

import java.math.BigInteger;

/*Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 *    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 *    номер банковского счета.
 *    Найти и вывести:
 *    a) список покупателей в алфавитном порядке;
 *    b) список покупателей, у которых номер кредитной карточки находится
 *    в заданном интервале.*/
public class Customer {
    private static int startID = 1;
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private BigInteger cardNumber;
    private long bankAccountNumber;

    Customer(String lastName, String firstName, String patronymic, String address, BigInteger cardNumber, long bankAccountNumber) {
        this.id = startID++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString() {
        return String.format("id: %d, Last Name: %s, Firs Name: %s, Patronymic: %s, Address: %s," +
                        "Credit Card Number: %s, Bank  Account Number: %d",
                id, lastName, firstName, patronymic, address,
                cardNumber.toString(), bankAccountNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(String fistName) {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.lastName = fistName;
    }

    public String getPatronymic(String patronymic) {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.lastName = patronymic;
    }

    public String getAddress(String address) {
        return address;
    }

    public void setAddress(String address) {
        this.lastName = address;
    }

    BigInteger getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
