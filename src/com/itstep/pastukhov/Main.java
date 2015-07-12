package com.itstep.pastukhov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать объект класса Компьютер, используя классы
 * Винчестер, Дисковод,Оперативная память, Процессор.
 * Методы: включить, выключить, проверить на
 * вирусы, вывести на консоль размер винчестера.
 * Created by lotrik on 12.07.15.
 */
public class Main {
    static Computer computer = new Computer();
    static int number;

    public static void main(String[] args) throws IOException {
        for (; ; ) {
            System.out.println("Введите\n1 - Включить ПК\n2 - Выключить ПК\n3 - Запустить проверку на вирусы\n" +
                    "4 - Показать размер HDD\n5 - Выход");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1: {
                    computer.PowerOn();
                    break;
                }
                case 2: {
                    computer.PowerOff();
                    break;
                }
                case 3: {
                    computer.CheckViruses();
                    break;
                }
                case 4: {
                    computer.HddSize();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }
    }
}
