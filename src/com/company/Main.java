package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Task> task = new ArrayList<>();

        public static boolean menu() {
            Scanner scan = new Scanner(System.in);
            while(true){
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int num = scan.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Введите задачу: ");
                    String str = scan.nextLine();
                    task.add(new Task(str));
                    break;
                case 2:
                    System.out.println(task.toString());
                    break;
                case 3:
                    System.out.println("Введите номер задачи для удаления \n");
                    System.out.println(task.toString());
                    int numTask = scan.nextInt();
                    task.remove(numTask - 1);
                    System.out.println("Оставшиеся задачи: \n");
                    System.out.println(task.toString());
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    return false;
                default:
                    System.out.println("Вы ввелм неверное значение");
                    break;
            }

        }


    }

    public static void main(String[] args) {
    menu();
    }
}
