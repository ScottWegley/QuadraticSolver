import java.util.Scanner;

public class InputProcessor {
    private double[] inputs;
    private boolean valid = true;

    public InputProcessor() {

    }

    public void collectInputs() {
        System.out.print("\nPlease enter three numbers in the order A B C: ");
        Scanner scanner = new Scanner(System.in);
        inputs = new double[3];
        try {
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = scanner.nextDouble();
            }
        } catch (Exception e) {
            valid = false;
        } finally {
            scanner.close();
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
