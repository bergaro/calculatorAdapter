public class IntsCalculator implements Ints {
    private final Calculator calculator;
    private double mainCalc;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        mainCalc =  calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) mainCalc;
    }

    @Override
    public int mult(int arg0, int arg1) {
        mainCalc = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) mainCalc;
    }

    @Override
    public int pow(int a, int b) {
        mainCalc = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) mainCalc;
    }
}
