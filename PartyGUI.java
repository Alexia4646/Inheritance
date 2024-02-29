// Alexia-Ana-Maria Popescu
// Hadassah Ofosu-Amoani
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PartyGUI extends JFrame implements ActionListener {
    // I am declaring the Swing components
    JLabel guestCountLabel = new JLabel("Total number of guests:");
    JTextField guestCountField = new JTextField(10);
    JLabel dinnerGuestCountLabel = new JLabel("Number of guests for dinner");
    JTextField dinnerGuestCountField = new JTextField(10);
    JLabel dinnerChoiceLabel = new JLabel("Dinner choice (1 for Fish, 2 for Turkey):");
    JTextField dinnerChoiceField = new JTextField(10);
    JLabel drinkChoiceLabel = new JLabel("Drink choice:");
    JTextField drinkChoiceField = new JTextField(10);
    JButton displayButton = new JButton("Display Invitation");

    public PartyGUI() {
        super("Dinner Party Invitation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        // I am setting the colors for Swing Components
        guestCountLabel.setForeground(Color.BLUE);
        dinnerGuestCountLabel.setForeground(Color.BLUE);
        dinnerChoiceLabel.setForeground(Color.BLUE);
        drinkChoiceLabel.setForeground(Color.BLUE);

        //I am adding Swing components to the frame
        add(guestCountLabel);
        add(guestCountField);
        add(dinnerGuestCountLabel);
        add(dinnerGuestCountField);
        add(dinnerChoiceLabel);
        add(dinnerChoiceField);
        add(drinkChoiceLabel);
        add(drinkChoiceField);
        add(new JLabel());
        add(new JLabel());
        add(displayButton);

        displayButton.setBackground(Color.BLUE);
        displayButton.setForeground(Color.RED);

        //I am adding action listener to the display button
        displayButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int guestCount = Integer.parseInt(guestCountField.getText());
        int dinnerGuestCount = Integer.parseInt(dinnerGuestCountField.getText());
        int dinnerChoice = Integer.parseInt(dinnerChoiceField.getText());
        String drinkChoice = drinkChoiceField.getText();

        String dinnerChoiceText = (dinnerChoice ==1) ? "Fish" : "Turkey";

        // I am using HTML to custom the text on the invitation
        String InvitationText = "<html><div style='text-align: center;'>" +
                "<h1 style='color: #FF5733; font-family: Arial;'>You're Invited!</h1>" +
                "<p style='color: #333333; font-size: 14pt; font-family: Arial;'>" +
                "Dear Guest,<br><br>" +
                "You are invited to a dinner party.<br>" +
                "Here are the details:<br><br>" +
                "<b>Total number of guests:</b> " + guestCount + "<br>" +
                "<b>Number of guests for dinner:</b> " + dinnerGuestCount + "<br>" +
                "<b>Dinner choice:</b> " + dinnerChoiceText + "<br>" +
                "<b>Drink choice:</b> " + drinkChoice + "<br><br>" +
                "We hope to see you there!<br><br>" +
                "Best regards,<br>" +
                "Host</p></div></html>";

        JOptionPane.showMessageDialog(this, InvitationText, "Dinner Party Invitation", JOptionPane.PLAIN_MESSAGE);

    }

    public static void main(String[]args) {
        PartyGUI partyGUI = new PartyGUI();
        partyGUI.setVisible(true);
    }
}
