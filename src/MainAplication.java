package src;

import java.util.Scanner;

public class MainAplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Context context = new Context();
        Double x;
        Double y;
        String operation;
        Double result;

            System.out.print("primeiro numero: ");
            x = input.nextDouble();

            System.out.print("operacao(+.-,/,*): ");
            operation = input.next();

            System.out.print("segundo numero: ");
            y = input.nextDouble();

            switch (operation) {
                case "+":
                    context.setStrategy(new ConcreteStrategySum());
                    break;
                case "-":
                    context.setStrategy(new ConcreteStrategySubtraction());
                    break;
                case "/":
                    context.setStrategy(new ConcreteStrategyDivision());
                    break;
                case "*":
                    context.setStrategy(new ConcreteStrategyMultiplication());
                    break;
            }
            result = context.executeStrategy(x, y);
            System.out.println("Resultado: " + result);

    }
}
