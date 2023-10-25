public class OutputHandler {
    private ComplexNumber[] outputs;
    private InputType classification;

    public OutputHandler() {
    }

    public OutputHandler(ComplexNumber[] _o, InputType _c) {
        this.classification = _c;
        this.outputs = _o;
    }

    public void output() {
        if(classification == null){
            outputINV();
            return;
        }
        switch (classification) {
            case QUADRATIC_TWO:
                outputQ2();
                break;
            case QUADRATIC_ONE:
                outputQ1();
                break;
            case LINEAR_ONE:
                outputL1();
                break;
            case NO_SOLUTION:
                outputNO();
                break;
            case INFINITE_SOLUTIONS:
                outputINF();
                break;
        }
    }

    private void outputQ2() {
        System.out.println("You have two quadratic roots: ");
        for (ComplexNumber c : outputs) {
            System.out.println(c.toString());
        }
    }

    private void outputQ1() {
        System.out.println("You have one quadratic root: ");
        for (ComplexNumber c : outputs) {
            System.out.println(c.toString());
        }
    }

    private void outputL1() {
        System.out.println("You have one linear root: ");
        for (ComplexNumber c : outputs) {
            System.out.println(c.toString());
        }
    }

    private void outputNO() {
        System.out.println("There were no solutions");
    }

    private void outputINF() {
        System.out.println("There were an infinite number of solutions.");
    }

    private void outputINV() {
        System.out.println("Your inputs were invalid.");
    }
}
