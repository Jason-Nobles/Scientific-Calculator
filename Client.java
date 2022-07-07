import java.awt.*;
import javax.swing.*;


public class Client 
{
	public static void main(String[] args) 
    {
		Calculator_Actions calculator;
		JFrame calcFrame = new JFrame("CI- Calculator");
		calcFrame.setLayout(null);
		calcFrame.setSize(360, 510);
		calcFrame.getContentPane().setBackground(Color.GRAY);
		calcFrame.setVisible(true);
		
		
		calculator = new Calculator_Actions(calcFrame);
    }
}
