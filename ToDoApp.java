/**
 * ToDoApp.java
 * This is a mini project for a simple To-Do application.
 * It allows users to add, remove, and view tasks.
 * It uses linked lists to manage tasks.
 */

import java.util.Scanner;

class TaskNode {
    private String task;
    private TaskNode nextTask; // Pointer or reference to the next task in the list

    // Create a constructor for TaskNode
    public TaskNode(String task) {
        this.task = task;
        nextTask = null;
    }

    // Getter and setter for task
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // Getter and setter for the pointer: next
    public TaskNode getNextTask() {
        return nextTask;
    }

    public void setNextTask(TaskNode nextTask) {
        this.nextTask = nextTask;
    }
}

class ToDoList {
    TaskNode head; // Head of the linked list
    TaskNode tail; // Tail of the linked list
    int size; // Size of the linked list

    // Constructor to initialize the ToDoList
    public ToDoList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add a task to the To-Do list
    public void addTask(String task) {
        TaskNode newTask = new TaskNode(task);

        if (head == null) {
            head = newTask; // If the list is empty, set head to the new task
            tail = newTask; // Set tail to the new task as well
        } else {
            tail.setNextTask(newTask); // Link the new task to the end of the list
            tail = newTask; // Update the tail to the new task
        }
        size++; // Increment the size of the list
        System.out.println("Task added: " + task);
    }

    // Method to remove a task from the To-Do list
    // public void removeTask(String task) {
    //     if (head == null) {
    //         System.out.println("No tasks to remove.");
    //         return;
    //     }
}

public class ToDoApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do Application!\n" +
                "Type 'add' to add a task, 'remove' to remove a task, and 'view' to view tasks.\n" +
                "Type 'exit' to quit the application.");
        
        Scanner userInput = new Scanner(System.in);
        String command = userInput.nextLine();

        // Check if the user wants to exit the application
        if (command.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the application. Goodbye!");
            userInput.close();
            return;
        }

        if (!command.equalsIgnoreCase("add")) {
            System.out.println("Invalid command. Please try again.");
        } else if (command.equalsIgnoreCase("add")) {
            System.out.println("Please enter the task you want to add:");
            String task = userInput.nextLine();
            ToDoList todoList = new ToDoList();
            todoList.addTask(task);
            System.out.println("Task added successfully!");
        } else {
            System.out.println("Exiting the application. Goodbye!");
        }
        userInput.close();
    }
}
