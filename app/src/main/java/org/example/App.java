package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final List<String> tasks = new ArrayList<>();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nTo-Do List CLI");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextLine()) {
                System.out.println("\nNo input detected. Exiting...");
                break;
            }

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Enter task: ");
                    if (scanner.hasNextLine()) {
                        tasks.add(scanner.nextLine().trim());
                        System.out.println("Task added!");
                    } else {
                        System.out.println("No input received!");
                    }
                    break;
                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        new App().run();
    }
}
