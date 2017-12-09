import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String age=JOptionPane.showInputDialog("How old are you?");	
int num=Integer.parseInt(age);
if(num>=18) {
	JOptionPane.showInputDialog("Who do you think the President shoud be?");
	JOptionPane.showMessageDialog(null, "Thank you for your vote!");
}
if(num<18) {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think");
}
	
}
}
