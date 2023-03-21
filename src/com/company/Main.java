package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Task> task = new ArrayList<>();

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
                    scan.nextLine();
                    System.out.println("Введите задачу: ");
                    String taskText = scan.nextLine();
                    task.add(new Task(taskText));

                    break;
                case 2:
                    tasks();
                    break;
                case 3:
                    System.out.println("Введите номер задачи для удаления \n");
                    tasks();
                    int numTask = scan.nextInt();
                    task.remove(numTask - 1);
                    System.out.println("Оставшиеся задачи: \n");
                    tasks();
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    return false;
                default:
                    System.out.println("Вы ввели неверное значение");
                    break;
            }

        }


    }
    public static void tasks(){
        for(int i=0; i<task.size(); i++){
            System.out.println(i+1 + ". " + task.get(i).toString());
        }

    }

    public static void main(String[] args) {
    menu();
    }
}
