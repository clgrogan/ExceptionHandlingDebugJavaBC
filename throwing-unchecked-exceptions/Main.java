import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Paul Pearson", "Stocker");
        Employee assisManager = new Employee("Nicholas Cage", "Assistant Manager");
        Employee manager = new Employee("Jude Law", "Manager");
        // Employee stocker = new Employee("Paul", null);
        // Employee assisManager = new Employee("Nicholas", " ");
        // Employee manager = new Employee(null, " ");

        Store store = new Store();

        store.setEmployees(0, stocker);
        store.setEmployees(1, assisManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();

    }
}
