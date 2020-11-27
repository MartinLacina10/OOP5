import java.util.Scanner;

public enum InputManager {
    INSTANCE;
    private Scanner dir = new Scanner(System.in);

    public String getString() {
        System.out.println("Zmenit slovnik ?");
        return dir.nextLine();

    }
}