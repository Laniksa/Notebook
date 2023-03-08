package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    public static ArrayList<Task> task = new ArrayList<>();

    public static boolean menu(Scanner scan){
        while(true){
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int num = scan.nextInt();
            if(num == 1){
                System.out.println("Введите задачу: ");
                String str = scan.nextLine();
                task.add(new Task(str));
            }if(num == 2){
                System.out.println(task.toString());
            }if (num ==3){
                System.out.println("Введите номер задачи для удаления \n");
                System.out.println(task.toString());
                int numTask = scan.nextInt();
                task.remove(num-1);
                System.out.println("Оставшиеся задачи: \n");
                System.out.println(task.toString());
            }if (num == 0){
                System.out.println("Программа завершена");
                return true;
            }else{
                System.out.println("Вы ввелм неверное значение");
            }
        }

    }

    public static void main(String[] args) {

    }
}
