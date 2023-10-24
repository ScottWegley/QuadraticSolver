public class EquationSolver {
    private double[] inputs;
    private ComplexNumber[] outputs;
    private InputType classification;

    public EquationSolver() {

    }

    public EquationSolver(double[] _in) {
        inputs = _in;
        classifyInput();
        if (!(classification == InputType.INFINITE_SOLUTION || classification == InputType.NO_SOLUTION)) {
            solve();
        }
    }

    public ComplexNumber[] getOutputs() {
        return outputs;
    }

    public InputType getClassification() {
        return classification;
    }

    private void classifyInput() {
        if (inputs[0] == 0) {
            if (inputs[1] == 0) {
                if (inputs[2] == 0) {
                    classification = InputType.INFINITE_SOLUTION;
                } else {
                    classification = InputType.NO_SOLUTION;
                }
            } else {
                classification = InputType.LINEAR_ONE;
            }
        } else {
            double discriminant = inputs[1] * inputs[1] - (4 * inputs[0] * inputs[2]);
            if (discriminant != 0) {
                classification = InputType.QUADRATIC_TWO;
            } else {
                classification = InputType.QUADRATIC_ONE;
            }
        }
    }

    private void solve() {
        outputs = new ComplexNumber[1];
        if(classification == InputType.LINEAR_ONE){
            solveLinear();
        } else {
            solveQuadratic();
        }
    }

    private void solveLinear() {

    }

    private void solveQuadratic() {
        ComplexNumber base = new ComplexNumber(-inputs[1]/(2*inputs[0]),0);
        ComplexNumber rOne = new ComplexNumber(inputs[1],0);
        rOne = ((rOne.mult(rOne)).sub(new ComplexNumber(4 * inputs[0] * inputs[1]))).sqrt();
        if(classification == InputType.QUADRATIC_TWO){
            outputs = new ComplexNumber[2];
            ComplexNumber rTwo = base.add(rOne);
            outputs[1] = rTwo;
        }
        rOne = base.sub(rOne);
        outputs[0] = rOne;
    }
}
