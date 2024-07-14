package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        API api = new API();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println(" do you want to?\n1.register \n2.get all users tasks \n3.add task to a user \n4.set task done");
            System.out.println("######################################");
            int choise = scanner.nextInt();
            System.out.println("enter id");
            String id= scanner.next();
            switch (choise){
                case 1:
                    api.registerId(id);
                    break;

                case 2:
                    api.getTasks(id);
                    break;

                case 3:
                    System.out.println("enter titel for task to create");
                    api.addTask(id, scanner.next());
                    break;
                case 4:
                    System.out.println("enter titel for task to set done");
                    api.compeleteTask(id, scanner.next());

            }
        }
    }

}