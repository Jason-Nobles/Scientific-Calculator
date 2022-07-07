import javax.swing.*;

public class Calculator_Buttons 
{
    public JButton num1 = new JButton("1");
    public JButton num2 = new JButton("2");
    public JButton num3 = new JButton("3");
    public JButton num4 = new JButton("4");
    public JButton num5 = new JButton("5");
    public JButton num6 = new JButton("6");
    public JButton num7 = new JButton("7");
    public JButton num8 = new JButton("8");
    public JButton num9 = new JButton("9");
    public JButton zero = new JButton("0");
    public JButton multiply = new JButton("\u00D7");
    public JButton divide = new JButton("\u00F7");
    public JButton add = new JButton("+");
    public JButton sub = new JButton("\u02D7");
    public JButton equals = new JButton("=");
    public JButton decimal = new JButton(".");
    public JButton clear = new JButton("C");
    public JButton sqaureNum = new JButton("x\u00B2");
    public JButton cubeNum = new JButton("x\u00B3");
    public JButton squareNum2 = new JButton("\u221A");
    public JButton percent = new JButton("%");
    public JButton modulist = new JButton("Mod");
    public JButton oneDivNum = new JButton("1/n");
    public JButton plusMinus = new JButton("\u00B1");
    
    public JButton sin = new JButton("sin");
    public JButton cos = new JButton("cos");
    public JButton tan = new JButton("tan");
    public JButton aSin = new JButton("asin");
    public JButton aCos = new JButton("acos");
    public JButton aTan = new JButton("atan");
    public JButton sinH = new JButton("sinh");
    public JButton cosH = new JButton("cosh");
    public JButton tanH = new JButton("tanh");
    public JButton powerTen = new JButton("10^n");
    public JButton log = new JButton("log");
    public JButton ln = new JButton("ln");
    public JButton abs = new JButton("abs");
    public JButton exit = new JButton("EXIT");
    
    public char mathOperation = ' ';
    public boolean plus = true;
    public boolean isDeci = false;
    public boolean isMathOperation = false;
    public JTextField displayResult = new JTextField();
    public JTextField calcInput = new JTextField();
    public String startInput = "";
    public String startDisplay = "";
    public double number1 = 0;
    public double number2 = 0;
    public double result = 0;

}
