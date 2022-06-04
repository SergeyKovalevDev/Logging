import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcImpl {
    private static final Logger log = LogManager.getLogger(CalcImpl.class);
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
            case "+" -> result = getAdd(firstOperand, secondOperand);
            case "-" -> result = getSub(firstOperand, secondOperand);
            case "*" -> result = getMul(firstOperand, secondOperand);
            case "/" -> {
                if (secondOperand == 0) log.warn("Attempt to divide by 0");
                else result = getDiv(firstOperand, secondOperand);
            }
        }

        System.out.println("Результат: " + result);
        log.info("Result " + result);
    }

//    public static void main(String[] args) throws IOException {
//        new CalcImpl().calcStarter();
//    }

    public int getAdd(int a, int b) {
        return Math.addExact(a, b);
    }

    public int getSub(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public int getMul(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public int getDiv(int a, int b) {
        return Math.floorDiv(a, b);
    }

}
