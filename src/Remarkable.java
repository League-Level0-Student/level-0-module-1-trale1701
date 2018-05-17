import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello there, whats your name?");
		if (name.equals("Kevin")) {
			JOptionPane.showMessageDialog(null, "Wazuuuuuuuuuup K, cool hoodie!");
		}
		if (name.equals("Yen")) {
			JOptionPane.showMessageDialog(null, "Hello, you seem cool.");
		}
		if (name.equals("Diego")) {
			JOptionPane.showMessageDialog(null, "Hello there, cool glasses!");
		}
		if (name.equals("Daniel")) {
			JOptionPane.showMessageDialog(null, "Hello, cool cool hair D");
		}
		else {
			JOptionPane.showMessageDialog(null, "Hello there, you are a cool guy or girl!");
		}
		
		
		
		
	}

}
