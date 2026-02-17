import javax.swing.*;

public class SelectRole {
    private JButton ownerRentVehicleButton;
    private JPanel panel1;
    private JButton clientSubmitJobButton;
    private JTextField wouldWouldYouLikeTextField;

   /* private void createUIComponents() {
        // TODO: place custom component creation code here} */
    public SelectRole() {
        wouldWouldYouLikeTextField.setEditable(false);
        wouldWouldYouLikeTextField.setBorder(null);

         ownerRentVehicleButton.addActionListener(e -> {
             JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
             frame.setTitle("VCTRS - Owner");
             frame.setContentPane(new OwnerForm().getPanel());
             frame.pack();
             frame.setLocationRelativeTo(null);
                 });
         clientSubmitJobButton.addActionListener(e -> {
             JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
             frame.setTitle("VCTRS - Client");
             frame.setContentPane(new ClientForm().getPanel());
             frame.pack();
             frame.setLocationRelativeTo(null);

         });
    }
    public JPanel getPanel() {
        return panel1;
    }
}
