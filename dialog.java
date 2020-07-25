import javax.swing.*;

public class dialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Whats is your name?");
        JOptionPane.showMessageDialog(null,"Welcome to java programming "+name);
    }
}
