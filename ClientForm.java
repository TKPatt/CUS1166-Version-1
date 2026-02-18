import javax.swing.*;

public class ClientForm {
    private JPanel panel1;
    private JLabel ClientID;
    private JTextField clientIDTextField;
    private JLabel ClientName;
    private JTextField ClientNameTextField;
    private JLabel jobDuration;
    private JTextField jobDurationTextField;
    private JLabel JobDeadline;
    private JTextField jobDeadlineTextField;
    private JButton backButton;
    private JButton clearButton;
    private JButton submitButton;


    public ClientForm() {
        backButton.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
            frame.setTitle("VCRTS - Select Role");
            frame.setContentPane(new SelectRole().getPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
        });
        clearButton.addActionListener(e -> {
            clientIDTextField.setText("");
            ClientNameTextField.setText("");
            jobDurationTextField.setText("");
            jobDeadlineTextField.setText("");

        });
        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(panel1,"Submit button has been clicked");
        });

    }
    public JPanel getPanel() {
        return panel1;
    }
}

