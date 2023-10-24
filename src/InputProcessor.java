import java.util.Scanner;

public class InputProcessor {
    private double[] inputs;
    private boolean valid = true;

    public InputProcessor() {

    }

    public void collectInputs() {
        System.out.print("\nPlease enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        inputs = new double[3];
        try {
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = scanner.nextDouble();
            }
        } catch (Exception e) {
            valid = false;
        }
    }

    public boolean isValid() {
        return valid;
    }

    public double[] getInputs() {
        if(inputs == null){
            collectInputs();
        }
        return inputs;
    }
}
