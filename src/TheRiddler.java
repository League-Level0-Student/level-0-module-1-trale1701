import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog("1+1=?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (a.equals("2")) {
    JOptionPane.showMessageDialog(null, "correct");
    score++;
    JOptionPane.showMessageDialog(null, "Your score is "+ score);
    }

		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong");
	JOptionPane.showMessageDialog(null, "Your score is "+ score);
}
		// 6. Add some more riddles
String b = JOptionPane.showInputDialog("2+2=?");
if (b.equals("4")) {
    JOptionPane.showMessageDialog(null, "correct");
    score++;
    JOptionPane.showMessageDialog(null, "Your score is "+ score);
    }
else {
	JOptionPane.showMessageDialog(null, "wrong");
	JOptionPane.showMessageDialog(null, "Your score is "+ score);
}
String c = JOptionPane.showInputDialog("6+9=?");
if (c.equals("15")) {
    JOptionPane.showMessageDialog(null, "correct");
    score++;
    JOptionPane.showMessageDialog(null, "Your score is "+ score);
    }
else {
	JOptionPane.showMessageDialog(null, "wrong");
	JOptionPane.showMessageDialog(null, "Your score is "+ score);
}

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "GAME OVER. Your score is "+ score);











		
	}
}

