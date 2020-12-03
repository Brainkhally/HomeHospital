package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Hospital {
    //Для вирішення задачі використовуйте колекції. Елементи колекції – об’єкти класу Пацієнт.
    //У коментарях до програми обґрунтуйте свій вибір колекцій та її реалізацій.
    private ArrayDeque<Patient> patients = new ArrayDeque<>();//первым пришёл — первым ушёл (очередь как она есть)
    private ArrayList<Patient> patientsViewed = new ArrayList<>();//Стек не подходит так как он удаляет данные, ArrayList стандарт

    public void addPatientInDeque(int numberPatient) {
        //Пацієнти записуються на прийом, утворюючи чергу.
        String name;
        String gender;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numberPatient; i++) {
            System.out.print("Введите имя пациента: ");
            name = in.next();
            System.out.print("Введите 1 если М, 2 - если Ж: ");
            switch (in.nextInt()) {
                case 1:
                    gender = "Мужчина";
                    break;
                case 2:
                    gender = "Женщина";
                    break;
                default:
                    gender = "не определен";
                    break;
            }
            patients.add(new Patient(name, gender));
        }
    }

    public void admitPatients(int numberPatient) {
        //Лікар приймає з черги n пацієнтів (n може менше з кількість пацієнтів в черзі)
        if (patients.size() < numberPatient){
            numberPatient = patients.size();
        }
        System.out.println("\nЛікар приймає з черги n пацієнтів");
        for (int i = 0; i < numberPatient; i++) {
            System.out.println("\nПринят пациент:");
            System.out.println("Имя: " + patients.getFirst().getName());
            System.out.println("Пол: " + patients.getFirst().getGender());
            //записуючи хто в нього був на прийомі
            patientsViewed.add(patients.pop());
        }
    }

    public void showAdmitsPatients() {
        //в кінці роботи видає підсумок скільки чоловіків та скільки жінок було на прийомі та імена прийнятих пацієнтів.
        System.out.println("\nПідсумок скільки чоловіків та скільки жінок було на прийомі");
        for (Patient patient : patientsViewed) {
            System.out.println("\n" + patient);
        }
    }
}
