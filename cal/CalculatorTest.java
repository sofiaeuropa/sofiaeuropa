package cal;

public class CalculatorTest {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}
