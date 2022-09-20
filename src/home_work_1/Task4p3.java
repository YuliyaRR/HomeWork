package home_work_1;

public class Task4p3 {

    public String divisibilityCheck (int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return "На ноль делить нельзя!!";
        } else if (firstNumber % secondNumber == 0) {
            return String.format("Число %d делится без остатка на число %d", firstNumber,secondNumber);
        } else {
            return String.format("Число %d делится на число %d с остатком", firstNumber,secondNumber);
        }
    }
}
