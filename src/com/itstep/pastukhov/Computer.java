package com.itstep.pastukhov;

/**
 * Создать объект класса Компьютер, используя классы
 * Винчестер, Дисковод,Оперативная память, Процессор.
 * Методы: включить, выключить, проверить на
 * вирусы, вывести на консоль размер винчестера.
 * Created by lotrik on 12.07.15.
 */
public class Computer {
    CPU cpu = new CPU();
    RAM ram = new RAM();
    FDD fdd = new FDD();
    HDD hdd = new HDD();
    Boolean power = false;

    public void PowerOn () {
        System.out.println ("ПК включен");
        System.out.println();
        power = true;
    }

    public void PowerOff () {
        System.out.println ("ПК выключен");
        System.out.println();
        power = false;
    }

    public void CheckViruses () {
        if (power) {
            System.out.println("Запущено сканирование на вирусы");
            System.out.println();
        } else {
            System.out.println("Невозможно зпустить сканирование т.к. ПК выключен. Включите ПК и повторите попытку");
            System.out.println();
        }
    }

    public void HddSize () {
        System.out.println ("Размер HDD - 1 TB");
        System.out.println();
    }
}
