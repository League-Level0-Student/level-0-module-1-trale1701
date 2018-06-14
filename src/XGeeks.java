//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
import javax.swing.JOptionPane;
/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {
		// 1. Save the superpower for each person in a variable.
String kevin = "super streng";
String yen = "super speed";
String daniel = "super jump";
String diego = "super person";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String a = JOptionPane.showInputDialog("Enter your name!");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (a.equals("kevin")) {
	JOptionPane.showMessageDialog(null,kevin);
}
else if (a.equals("yen")) {
	JOptionPane.showMessageDialog(null,yen);
}
else if (a.equals("diego")) {
    JOptionPane.showMessageDialog(null,diego);
}
else if (a.equals("daniel")) {
		JOptionPane.showMessageDialog(null,daniel);	
}
else {
	JOptionPane.showMessageDialog(null,"able to fly");	
}
	}
}