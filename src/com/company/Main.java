package com.company;

import java.util.Scanner;

/*
 *
 * Змоделювати роботу поліклініки. Пацієнти записуються на прийом, утворюючи чергу. Кількість пацієнтів – на вибір програміста:
 * або задається з клавіатури, або йде додавання пацієнтів, доки не буде введено спеціальний символ або ознака.
 * Лікар приймає з черги n пацієнтів (n може менше з кількість пацієнтів в черзі), записуючи хто в нього був на прийомі,
 * і в кінці роботи видає підсумок скільки чоловіків та скільки жінок було на прийомі та імена прийнятих пацієнтів.
 * Для моделювання напишіть програму мовою java.
 * Для вирішення задачі використовуйте колекції. Елементи колекції – об’єкти класу Пацієнт.
 * У коментарях до програми обґрунтуйте свій вибір колекцій та її реалізацій.
 *
 */
public class Main {
    public static void main(String[] args) {
        boolean exitMenu = false;

        int menu;
        Scanner scanner = new Scanner(System.in);

        Hospital hospital = new Hospital();

        int tmp;

        //Змоделювати роботу поліклініки

        //Пацієнти записуються на прийом, утворюючи чергу. Кількість пацієнтів – на вибір програміста або задається з клавіатури...
        System.out.println("Введите количество пациентов > ");
        hospital.addPatientInDeque(scanner.nextInt());

        //Лікар приймає з черги n пацієнтів (n може менше з кількість пацієнтів в черзі)
        hospital.admitPatients(5);

        //і в кінці роботи видає підсумок скільки чоловіків та скільки жінок було на прийомі та імена прийнятих пацієнтів
        hospital.showAdmitsPatients();
    }
}
