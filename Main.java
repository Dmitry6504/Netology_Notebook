package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            message();
            String ansver = scanner.nextLine();
            int ansvers = Integer.parseInt(ansver);

            switch (ansvers) {
                case 1:
                    System.out.println("Введите задачу для планирования:");
                    list.add(scanner.nextLine());
                    break;

                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + " . " + list.get(i));
                    }
                    if (list.isEmpty()) {
                        System.out.println("Список задач пуст!");
                    }
                    break;

                case 3:
                    String i = scanner.nextLine();
                    int j = Integer.parseInt(i) - 1;
                    list.remove(j);
                    break;

                case 0:
                    break;

            }
            if (ansvers == 0)
                break;
        }
    }

    public static void message() {
        System.out.println();
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");

    }
}
