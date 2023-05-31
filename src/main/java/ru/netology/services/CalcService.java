package ru.netology.services;

public class CalcService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int i = 1; i <= 12; i++) {

            if (money < threshold) {
                money = money + income - expenses;
            } else {
                count = count + 1;
                // i++;
                money = (money - expenses) / 3;
            }
        }
        return count;
    }
}