package com.ivanparanin.chapter2;

public class Ex_2_1 {
    /* public static void main(String[] args) {
         System.out.println("Hello, world!");
     }
 }Исправьте код программы-советчика.
 Если до зарплаты остаётся меньше 10 дней,
 сообщения останутся прежними, если же больше 10 — пускай печатается совет для предыдущей категории.
 Например, если на счету 15000 рублей и при этом до зарплаты остаётся 17 дней, то напечатается не «Неплохо!
 Прикупите долларов и зайдите поужинать в классное место.»,
  а «Окей, пора в Макдак!».

     */
    public static void main(String[] args) {

        double moneyBeforeSalary = 15000.0; // Количество денег до зарплаты
        int daysBeforeSalary = 14;

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!"); // -
        } else if (moneyBeforeSalary < 10000) {
            // Здесь нужное условие уже добавили
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!"); // -
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }

        } else if (moneyBeforeSalary < 30000) {
            // Допишите условие
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            } else if (daysBeforeSalary < 17) {
                System.out.println("Окей, пора в Макдак!");
            }

        } else {
            // Если до зарплаты меньше 10 дней, то едим крабов
            if (moneyBeforeSalary > 15000)
                System.out.println("Класс! Заказывайте крабов!");
                // Иначе — доллары и ужин в хорошем ресторане
            else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");

            }
        }
    }
}