import javax.swing.*;

public class OwnerForm {
    private JPanel panel1;
    private JTextField OwnerIDtextfield;
    private JTextField VehicleMakeTextField;
    private JTextField VehicleModeltextField;
    private JTextField Residencytimetextfield;
    private JButton backButton;
    private JButton clearButton;
    private JButton submitButton;
    private JTextField VehicleYeartextfield;

    public OwnerForm() {
        backButton.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
            frame.setTitle("VCRTS - Select Role");
            frame.setContentPane(new SelectRole().getPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
        });
        clearButton.addActionListener(e -> {
            OwnerIDtextfield.setText("");
            VehicleMakeTextField.setText("");
            VehicleModeltextField.setText("");
            Residencytimetextfield.setText("");
            VehicleYeartextfield.setText("");
        });
        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(panel1,"Submit button has been clicked");
        });
    }


    public JPanel getPanel() {
        return panel1;
    }
}