public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("использование базового класса Calculator:");
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        System.out.println("использование класса адаптера:");
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(5, 15));
        System.out.println(intsCalc.pow(2, 10));
    }
}
