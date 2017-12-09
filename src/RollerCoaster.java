import javax.swing.JOptionPane;

public class RollerCoaster {

public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("How tall are you in inches?");	
	int tall=Integer.parseInt(height);
	
	if (tall>=48) {
JOptionPane.showMessageDialog(null, "You can go on the rollercoaster");

}

	if(tall<48) {
	JOptionPane.showMessageDialog(null, "You need to be taller to ride");
}

}

}

