public class MainApp {
    public static void main(String[] args) {
        InputProcessor ip = new InputProcessor();
        EquationSolver eq;
        OutputHandler oh;
        ip.collectInputs();
        if(!ip.isValid()){
            oh = new OutputHandler();
        } else {
            eq = new EquationSolver(ip.getInputs());
            oh = new OutputHandler(eq.getOutputs(), eq.getClassification());
        }
        oh.output();
    }
}
