public class MainApp {
    public static void main(String[] args) {
        InputProcessor ip = new InputProcessor();
        EquationSolver eq;
        ip.collectInputs();
        if(!ip.isValid()){

        } else {
            eq = new EquationSolver(ip.getInputs());
            System.out.println(eq.getClassification());
            for (ComplexNumber c : eq.getOutputs()) {
                System.out.println(c.toString());
            }
        }
    }
}
