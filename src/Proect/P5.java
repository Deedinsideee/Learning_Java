package Proect;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        int numberOfRecords; // количество клиентов
        Object[][] clients;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество клиентов: ");
        numberOfRecords = input.nextInt();
        clients = new Object[numberOfRecords][4];

        for (int i = 0; i < numberOfRecords; i++) {
            System.out.print("Введите фамилию: ");
            // Записываем фамилию в колонку с индексом 0
            clients[i][0] = input.next();

            System.out.print("Введите имя: ");
            // Записываем имя в колонку с индексом 1
            clients[i][1] = input.next();

            System.out.print("Введите отчество: ");
            // Записываем отчество в колонку с индексом 2
            clients[i][2] = input.next();

            System.out.print("Введите сумму на счете: ");
            // Записываем баланс счета в колонку с индексом 3
            clients[i][3] = input.nextDouble();
        }
        for (int i = 0; i < clients.length; i++) { // Внешний цикл
            for (int j = 0; j < clients.length - 1; j++) { // Внутренний цикл


                double firstInPair = (Double) clients[j][3];
// второй элемент в паре
                double secondInPair = (Double) clients[j + 1][3];
                if(firstInPair > secondInPair) {
                    // Если порядок элементов нарушен
                    // меняем строки местами
                    swap(clients, j, j + 1);
                }






            }
        }

        System.out.println("Данные клиентов в порядке увеличения баланса счета:");
        for (int i = 0; i < clients.length; i++) {
            String surnameWithInitials = clients[i][0] + " ";
// Инициал имени
            surnameWithInitials += clients[i][1].toString().substring(0, 1) + ".";
// инициал отчества
            surnameWithInitials += clients[i][2].toString().substring(0, 1) + ".";
// Баланс счета
            surnameWithInitials += " " + clients[i][3];
            System.out.println(surnameWithInitials);
        }

    }

    static void swap(Object[][] array, int i, int j) {
        // Обмениваем строки местами
        for (int k = 0; k < array[i].length; k++) { // Итерируемся по элементам двух строк
            // буферный элемент в котором хранится значение элемента массива строки с индексом i
            Object buff = array[i][k];
            // в ячейку строки с индексом i записываем значение из ячейки строки с индексом j той же колонки
            array[i][k] = array[j][k];
            // в ячейку строки с индексом j записываем значение из буфера
            array[j][k] = buff;
        }
    }



}