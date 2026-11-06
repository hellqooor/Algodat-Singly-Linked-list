import java.util.Scanner;
import java.util.Stack;

public class KalkulatorPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ekspresi = scanner.nextLine();
        scanner.close();

        try {
            System.out.println(hitungPostfix(ekspresi));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static double hitungPostfix(String exp) {
        Stack<Double> stackAngka = new Stack<>();
        

        String[] token = exp.split("\\s+");

        for (String t : token) {
            if (t.isEmpty()) continue;

            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                double b = stackAngka.pop();
                double a = stackAngka.pop();
                double hasil = lakukanOperasi(t.charAt(0), b, a);
                stackAngka.push(hasil);
            } 
            else {
                stackAngka.push(Double.parseDouble(t));
            }
        }

        return stackAngka.pop();
    }

    public static double lakukanOperasi(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }
}

