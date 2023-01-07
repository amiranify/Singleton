package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Введите входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Прошло фильтр" + filteredList.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");

    }
}