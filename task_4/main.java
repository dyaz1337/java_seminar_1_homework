//* Дополнительно: +Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//  Требуется восстановить выражение до верного равенства.
//  Предложить хотя бы одно решение или сообщить, что его нет.
//  Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69

package task_4;

public class main {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        int q, w, e;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String tempEquation = equation.replace("?", String.valueOf(i));
                tempEquation = tempEquation.replaceFirst("\\?", String.valueOf(j));
                String[] parts = tempEquation.split(" ");
                q = Integer.parseInt(parts[0]);
                w = Integer.parseInt(parts[2]);
                e = Integer.parseInt(parts[4]);
                if (q + w == e) {
                    System.out.println(tempEquation + " => " + q + " + " + w + " = " + e);
                    return;
                }
            }
        }
        System.out.println("No solution found.");
    }
}