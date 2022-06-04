import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcImpl {
    private static final Logger log = LoggerFactory.getLogger(CalcImpl.class);
    public void calcStarter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первый операнд: ");
        int firstOperand = Integer.parseInt(reader.readLine());
        log.info("Entered first operand " + firstOperand);
        System.out.print("Введите команду (+, -, *, /): ");
        String command = reader.readLine();
        log.info("Entered command " + command);
        System.out.print("Введите второй операнд: ");
        int secondOperand = Integer.parseInt(reader.readLine());
        log.info("Entered second operand " + secondOperand);
        int result = 0;
        switch (command) {
            case "+" -> result = firstOperand + secondOperand;
            case "-" -> result = firstOperand - secondOperand;
            case "*" -> result = firstOperand * secondOperand;
            case "/" -> {
                if (secondOperand == 0) log.warn("Attempt to divide by 0");
                else result = firstOperand / secondOperand;
            }
        }

        System.out.println("Результат: " + result);
        log.info("Result " + result);
    }

    public static void main(String[] args) throws IOException {
        new CalcImpl().calcStarter();
    }

}
