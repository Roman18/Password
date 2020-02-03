package Draft;

import java.util.Scanner;
import javax.swing.*;
public class Draft4 {
    public static void password(String h) {
        String h1 = h.replaceAll("[^a-zA-Z0-9 а-яА-Я]", "");
        int q = h.length() - h1.length();
        String h2 = h1.replaceAll("[^a-zA-Z а-яА-Я]", "");
        int w = h1.length() - h2.length();
        if (h.length() < 8) {
            JOptionPane.showMessageDialog(null,"Пароль должен содержать не менее 8 символов");
        } else if (q > 0) {
            JOptionPane.showMessageDialog(null,"Пароль состоит только из букв и цифр");
        } else if (w <= 2) {
            JOptionPane.showMessageDialog(null,"Пароль должен содержать не менее 2 цифр");
        } else {
            String str ="Пароль принят!";
            str=str+"\nПоздравляю!!";
            JOptionPane.showMessageDialog(null,str);
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String num = JOptionPane.showInputDialog("Введите пароль");
        password(num);
    }
}


