package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int sec, min, chas;
        sec=seconds % 60; // отделили секунды
        int m=(seconds - sec) / 60;
        min=m%60;      // отделили минуты
        int h=(m-min)/60; // знаем сколько часов осталось
        chas=h%24; // отделили часы в сутках
        stringBuilder = stringBuilder.append(chas + ":");
        stringBuilder = min > 9 ? stringBuilder.append(min + ":") : stringBuilder.append("0" + min + ":");
        stringBuilder = sec > 9 ? stringBuilder.append(sec) : stringBuilder.append("0" + sec);
        System.out.println(stringBuilder);

    }
}
