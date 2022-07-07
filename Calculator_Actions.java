import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator_Actions extends Calculator_Buttons implements ActionListener
{
	public Calculator_Actions(JFrame calcFrame)
    {
		
		//display results layout   
        JPanel displayInput = new JPanel(); 
        JPanel displayResultScreen = new JPanel();
        calcFrame.add(displayInput);
        calcFrame.add(displayResultScreen);
        
        Font displayScreenFont = new Font("Sans Serif", Font.BOLD, 20);
        displayInput.setBounds(0, 0, 340, 40);
        displayInput.add(calcInput);
        displayInput.setLayout(null);
        calcInput.setBounds(1, 0, 337, 35);
        calcInput.setHorizontalAlignment(JTextField.LEFT);
        calcInput.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        calcInput.setText("0");
        calcInput.setBackground(Color.GREEN);
        
        displayResultScreen.setBounds(0, 40, 340, 50);
        displayResultScreen.add(displayResult);
        displayResultScreen.setLayout(null);
        displayResult.setBounds(1, 0, 337, 48);
        displayResult.setHorizontalAlignment(JTextField.RIGHT);
        displayResult.setFont(displayScreenFont);
        displayResult.setText("0");
        displayResult.setBackground(Color.GREEN);
        
        
        //Calculator buttons panel
        JPanel calcButtons = new JPanel(); 
        JPanel calcTrigButtons = new JPanel();
        calcFrame.add(calcButtons);
        calcFrame.add(calcTrigButtons);

        Font calcButtonFont = new Font("Sans Serif", Font.PLAIN, 15);
        Font trigButtonFont = new Font("Sans Serif", Font.PLAIN, 10);
        calcButtons.setBounds(0, 100, 330, 200);
        calcButtons.setLayout(null);
        calcButtons.setBackground(Color.GRAY);
        
        
        
        //button and operator fonts
        num1.setFont(calcButtonFont);  
        num2.setFont(calcButtonFont);         
        num3.setFont(calcButtonFont);     
        num4.setFont(calcButtonFont);         
        num5.setFont(calcButtonFont);      
        num6.setFont(calcButtonFont);        
        num7.setFont(calcButtonFont);     
        num8.setFont(calcButtonFont);      
        num9.setFont(calcButtonFont);         
        zero.setFont(calcButtonFont);        
        add.setFont(calcButtonFont);       
        sub.setFont(calcButtonFont);       
        multiply.setFont(calcButtonFont);       
        divide.setFont(calcButtonFont);       
        decimal.setFont(calcButtonFont);   
        
        sin.setFont(calcButtonFont);        
        cos.setFont(calcButtonFont);        
        tan.setFont(calcButtonFont);       
        aSin.setFont(trigButtonFont);     
        aCos.setFont(trigButtonFont);         
        aTan.setFont(trigButtonFont);        
        sinH.setFont(trigButtonFont);           
        cosH.setFont(trigButtonFont);     
        tanH.setFont(trigButtonFont);      
        log.setFont(calcButtonFont);
        ln.setFont(calcButtonFont);                
        abs.setFont(calcButtonFont);
        exit.setFont(calcButtonFont);      
        powerTen.setFont(trigButtonFont); 
        
        equals.setFont(new Font("Times New Roman", Font.PLAIN, 30));      
        
        clear.setFont(calcButtonFont);        
        sqaureNum.setFont(calcButtonFont);         
        squareNum2.setFont(calcButtonFont);        
        cubeNum.setFont(calcButtonFont);              
        percent.setFont(calcButtonFont); 
        modulist.setFont(new Font("Sans Serif", Font.PLAIN, 8));  
        oneDivNum.setFont(trigButtonFont);    
        plusMinus.setFont(calcButtonFont);  
        
        
        //Calculator buttons position on panel
        calcButtons.add(clear).setBounds(280, 0, 54, 38);
  
        calcButtons.add(num7).setBounds(10, 38, 52, 36);
        calcButtons.add(num8).setBounds(64, 38, 52, 36);
        calcButtons.add(num9).setBounds(118, 38, 52, 36);   
        calcButtons.add(multiply).setBounds(172, 38, 52, 36);
        calcButtons.add(divide).setBounds(226, 38, 52, 36);
        calcButtons.add(sqaureNum).setBounds(280, 38, 52, 36);
        
        calcButtons.add(num4).setBounds(10, 76, 52, 36);
        calcButtons.add(num5).setBounds(64, 76, 52, 36);
        calcButtons.add(num6).setBounds(118, 76, 52, 36);
        calcButtons.add(add).setBounds(172, 76, 52, 36);
        calcButtons.add(sub).setBounds(226, 76, 52, 36);
        calcButtons.add(cubeNum).setBounds(280, 76, 52, 36);
        
        calcButtons.add(num1).setBounds(10, 114, 52, 36);
        calcButtons.add(num2).setBounds(64, 114, 52, 36);
        calcButtons.add(num3).setBounds(118, 114, 52, 36);
        calcButtons.add(equals).setBounds(172, 114, 106, 36);
        calcButtons.add(modulist).setBounds(280, 114, 52, 36);
        
        calcButtons.add(zero).setBounds(10, 152, 52, 36);
        calcButtons.add(decimal).setBounds(64, 152, 52, 36);
        calcButtons.add(plusMinus).setBounds(118, 152, 52, 36);
        calcButtons.add(oneDivNum).setBounds(172, 152, 52, 36);
        calcButtons.add(percent).setBounds(226, 152, 52, 36);
        calcButtons.add(squareNum2).setBounds(280, 152, 52, 36);   
        
        calcTrigButtons.setBounds(0, 310, 330, 145);
        calcTrigButtons.setLayout(null);
        calcTrigButtons.setBackground(Color.GRAY);

        calcTrigButtons.add(sin).setBounds(10, 0, 63, 36);
        calcTrigButtons.add(cos).setBounds(75, 0, 63, 36);
        calcTrigButtons.add(tan).setBounds(140, 0, 63, 36);
        calcTrigButtons.add(log).setBounds(205, 0, 63, 36);
        calcTrigButtons.add(ln).setBounds(270, 0, 62, 36);
        
        calcTrigButtons.add(aSin).setBounds(10, 38, 63, 36);
        calcTrigButtons.add(aCos).setBounds(75, 38, 63, 36);
        calcTrigButtons.add(aTan).setBounds(140, 38, 63, 36);
        calcTrigButtons.add(powerTen).setBounds(205, 38, 63, 36);
        calcTrigButtons.add(abs).setBounds(270, 38, 62, 36);
       
        calcTrigButtons.add(sinH).setBounds(10, 76, 63, 36);
        calcTrigButtons.add(cosH).setBounds(75, 76, 63, 36);
        calcTrigButtons.add(tanH).setBounds(140, 76, 63, 36);
        calcTrigButtons.add(exit).setBounds(205, 76, 130, 36);


        
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        decimal.addActionListener(this);
        equals.addActionListener(this);

        clear.addActionListener(this);
        sqaureNum.addActionListener(this);
        squareNum2.addActionListener(this);
        cubeNum.addActionListener(this);
        percent.addActionListener(this);
        modulist.addActionListener(this);
        oneDivNum.addActionListener(this);
        plusMinus.addActionListener(this);

        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        aSin.addActionListener(this);
        aCos.addActionListener(this);
        aTan.addActionListener(this);
        sinH.addActionListener(this);
        cosH.addActionListener(this);
        tanH.addActionListener(this);
        powerTen.addActionListener(this);
        log.addActionListener(this);
        ln.addActionListener(this);
        abs.addActionListener(this);
        exit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
            if (e.getSource() == num1) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "1";
                            startInput = "1";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "1";
                            startInput += "1";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == num2) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "2";
                            startInput = "2";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "2";
                            startInput += "2";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == num3)
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "3";
                            startInput = "3";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "3";
                            startInput += "3";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == num4) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "4";
                            startInput = "4";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "4";
                            startInput += "4";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == num5) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "5";
                            startInput = "5";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "5";
                            startInput += "5";
                            calcInput.setText(startInput);
                    }
            }
            else if (e.getSource() == num6) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "6";
                            startInput = "6";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "6";
                            startInput += "6";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == num7) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "7";
                            startInput = "7";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "7";
                            startInput += "7";
                            calcInput.setText(startInput);
                    }
            }
            else if (e.getSource() == num8) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "8";
                            startInput = "8";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "8";
                            startInput += "8";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == num9) 
            {
                    if(mathOperation == '=')
                    {
                            startDisplay = "9";
                            startInput = "9";
                            calcInput.setText(startInput);
                            mathOperation = ' ';
                    }
                    else 
                    {
                            startDisplay = startDisplay + "9";
                            startInput += "9";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == zero) 
            {
                    if(startDisplay.equals(""))
                    {
                            startDisplay = "0";
                            startInput += "0";
                            calcInput.setText(startInput);
                    }
                    else
                    {
                            startDisplay = startDisplay + "0";
                            startInput += "0";
                            calcInput.setText(startInput);
                    }
            } 
            else if (e.getSource() == decimal) 
            {
                    if(startDisplay.equals(""))
                    {
                            startDisplay = "0.";
                            startInput += "0.";
                            calcInput.setText(startInput);
                    }
                    else if(!isDeci)
                    {
                            startDisplay = startDisplay + ".";
                            startInput += ".";
                            calcInput.setText(startInput);
                    }
                    isDeci = true;
            } 
            else if(e.getSource() == plusMinus && !startDisplay.equals("") && !isMathOperation)
            {
                    if(plus)
                    {
                            startDisplay = "-" + startDisplay;
                            startInput = startDisplay;
                            calcInput.setText(startInput);
                            plus = false;
                    }
                    else
                    {
                            startDisplay = startDisplay.substring(1, startDisplay.length());
                            startInput = startDisplay.substring(1, startDisplay.length());
                            calcInput.setText(startInput);
                            plus = true;
                    }
            }
            else if (e.getSource() == add && (!startDisplay.equals("") || mathOperation == '=')) 
            {
                    if(!isMathOperation)
                    {
                            number1 = Double.parseDouble(startDisplay);
                            startDisplay = "";
                            mathOperation = '+';
                            plus = true;
                            startInput += " + ";
                            calcInput.setText(startInput);
                            if(isDeci)
                            {
                                    displayResult.setText("" + number1);
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)number1);
                            }
                    }
                    else if(isMathOperation && mathOperation != '=')
                    {
                            number2  = Double.parseDouble(startDisplay);
                            
                            if(mathOperation == '+')
                            {
                                    result = number1 + number2;
                            }
                            else if(mathOperation == '-')
                            {
                                    result = number1 - number2;
                            }
                            else if(mathOperation == '*')
                            {
                                    result = number1 * number2;
                            }
                            else if(mathOperation == '/')
                            {
                                    result = number1 / number2;
                            }
                            else if(mathOperation == '%')
                            {
                                    result = number1 % number2;
                            }
                            else
                            {
                                    result = number2;
                            }
                            
                            String temp = "";
                            
                            if(isDeci || mathOperation == '/')
                            {
                                    displayResult.setText("" + result);
                                    temp = ""+result;
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)result);
                                    temp = "" + (long)result;
                            }
                            mathOperation = '+';
                            startDisplay = "";
                            number1 = result;
                            plus = true;
                            isDeci = false;
                            isMathOperation = true;
                            startInput += " + ";
                            calcInput.setText(startInput);
                            startInput = temp + " + ";
                    }
                    else if(mathOperation == '=')
                    {
                            startDisplay = "";
                            mathOperation = '+';
                            plus = true;
                            isMathOperation = true;
                            startInput += " + ";
                            calcInput.setText(startInput);
                    }
                    isMathOperation = true;
            }
            else if (e.getSource() == sub && (!startDisplay.equals("") || mathOperation == '='))
            {
                    if(!isMathOperation)
                    {
                            number1 = Double.parseDouble(startDisplay);
                            startDisplay = "";
                            mathOperation = '-';
                            plus = true;
                            startInput += " - ";
                            calcInput.setText(startInput);
                            if(isDeci)
                            {
                                    displayResult.setText("" + number1);
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)number1);
                            }
                    }
                    else if(isMathOperation && mathOperation != '=')
                    {
                            number2  = Double.parseDouble(startDisplay);
                            
                            if(mathOperation == '+')
                            {
                                    result = number1 + number2;
                            }
                            else if(mathOperation == '-')
                            {
                                    result = number1 - number2;
                            }
                            else if(mathOperation == '*')
                            {
                                    result = number1 * number2;
                            }
                            else if(mathOperation == '/')
                            {
                                    result = number1 / number2;
                            }
                            else if(mathOperation == '%')
                            {
                                    result = number1 % number2;
                            }
                            else
                            {
                                    result = number2;
                            }
                            String temp = "";
                            if(isDeci || mathOperation == '/')
                            {
                                    displayResult.setText("" + result);
                                    temp = ""+result;
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)result);
                                    temp = "" + (long)result;
                            }
                            mathOperation = '-';
                            startDisplay = "";
                            number1 = result;
                            plus = true;
                            isDeci = false;
                            isMathOperation = true;
                            startInput += " - ";
                            calcInput.setText(startInput);
                            startInput = temp + " + ";
                    }
                    else if(mathOperation == '=')
                    {
                            startDisplay = "";
                            mathOperation = '-';
                            plus = true;
                            isMathOperation = true;
                            startInput += " - ";
                            calcInput.setText(startInput);
                    }
                    isMathOperation = true;
            }
            else if (e.getSource() == multiply && (!startDisplay.equals("") || mathOperation == '=')) 
            {
                    if(!isMathOperation)
                    {
                            number1 = Double.parseDouble(startDisplay);
                            startDisplay = "";
                            mathOperation = '*';
                            plus = true;
                            startInput += " \u00D7 ";
                            calcInput.setText(startInput);
                            if(isDeci)
                            {
                                    displayResult.setText("" + number1);
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)number1);
                            }
                    }
                    else if(isMathOperation && mathOperation != '=')
                    {
                            number2  = Double.parseDouble(startDisplay);
                            
                            if(mathOperation == '+')
                            {
                                    result = number1 + number2;
                            }
                            else if(mathOperation == '-')
                            {
                                    result = number1 - number2;
                            }
                            else if(mathOperation == '*')
                            {
                                    result = number1 * number2;
                            }
                            else if(mathOperation == '/')
                            {
                                    result = number1 / number2;
                            }
                            else if(mathOperation == '%')
                            {
                                    result = number1 % number2;
                            }
                            else
                            {
                                    result = number2;
                            }
                            String temp = "";
                            if(isDeci || mathOperation == '/')
                            {
                                    displayResult.setText("" + result);
                                    temp = ""+result;
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)result);
                                    temp = "" + (long)result;
                            }
                            mathOperation = '*';
                            startDisplay = "";
                            number1 = result;
                            plus = true;
                            isDeci = false;
                            isMathOperation = true;
                            startInput += " \u00D7 ";
                            calcInput.setText(startInput);
                            startInput = temp + " \u00D7 ";
                    }
                    else if(mathOperation == '=')
                    {
                            startDisplay = "";
                            mathOperation = '*';
                            plus = true;
                            isMathOperation = true;
                            startInput += " \u00D7 ";
                            calcInput.setText(startInput);
                    }
                    isMathOperation = true;
            }
            else if (e.getSource() == divide && (!startDisplay.equals("") || mathOperation == '='))
            {
                    if(!isMathOperation)
                    {
                            number1 = Double.parseDouble(startDisplay);
                            startDisplay = "";
                            mathOperation = '/';
                            plus = true;
                            startInput += " / ";
                            calcInput.setText(startInput);
                            if(isDeci)
                            {
                                    displayResult.setText("" + number1);
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)number1);
                            }
                    }
                    else if(isMathOperation && mathOperation != '=')
                    {
                            number2  = Double.parseDouble(startDisplay);
                            
                            if(mathOperation == '+')
                            {
                                    result = number1 + number2;
                            }
                            else if(mathOperation == '-')
                            {
                                    result = number1 - number2;
                            }
                            else if(mathOperation == '*')
                            {
                                    result = number1 * number2;
                            }
                            else if(mathOperation == '/')
                            {
                                    result = number1 / number2;
                            }
                            else if(mathOperation == '%')
                            {
                                    result = number1 % number2;
                            }
                            else
                            {
                                    result = number2;
                            }
                            String temp = "";
                            if(isDeci || mathOperation == '/')
                            {
                                    displayResult.setText("" + result);
                                    temp = ""+result;
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)result);
                                    temp = ""+(long)result;
                            }
                            mathOperation = '*';
                            startDisplay = "";
                            number1 = result;
                            plus = true;
                            isDeci = false;
                            isMathOperation = true;
                            startInput += " / ";
                            calcInput.setText(startInput);
                            startInput = temp + " / ";
                    }
                    else if(mathOperation == '=')
                    {
                            startDisplay = "";
                            mathOperation = '/';
                            plus = true;
                            isMathOperation = true;
                            startInput += " / ";
                            calcInput.setText(startInput);
                    }
                    isMathOperation = true;
            } 
            else if (e.getSource() == modulist && (!startDisplay.equals("") || mathOperation == '='))
            {
                    if(!isMathOperation)
                    {
                            number1 = Double.parseDouble(startDisplay);
                            startDisplay = "";
                            mathOperation = '%';
                            plus = true;
                            startInput += " mod ";
                            calcInput.setText(startInput);
                            if(isDeci)
                            {
                                    displayResult.setText("" + number1);
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)number1);
                            }
                    }
                    else if(isMathOperation && mathOperation != '=')
                    {
                            number2  = Double.parseDouble(startDisplay);
                            
                            if(mathOperation == '+')
                            {
                                    result = number1 + number2;
                            }
                            else if(mathOperation == '-')
                            {
                                    result = number1 - number2;
                            }
                            else if(mathOperation == '*')
                            {
                                    result = number1 * number2;
                            }
                            else if(mathOperation == '/')
                            {
                                    result = number1 / number2;
                            }
                            else if(mathOperation == '%')
                            {
                                    result = number1 % number2;
                            }
                            else
                            {
                                    result = number2;
                            }
                            String temp = "";
                            if(isDeci || mathOperation == '/')
                            {
                                    displayResult.setText(""+result);
                                    temp = ""+result;
                            }
                            else if(!isDeci)
                            {
                                    displayResult.setText("" + (long)result);
                                    temp = "" + (long)result;
                            }
                            mathOperation = '%';
                            startDisplay = "";
                            number1 = result;
                            plus = true;
                            isDeci = false;
                            isMathOperation = true;
                            startInput += " mod ";
                            calcInput.setText(startInput);
                            startInput = temp + " * ";
                    }
                    else if(mathOperation == '=')
                    {
                            startDisplay = "";
                            mathOperation = '%';
                            plus = true;
                            isMathOperation = true;
                            startInput += " mod ";
                            calcInput.setText(startInput);
                    }
                    isMathOperation = true;
            }
            else if (e.getSource() == equals && !startDisplay.equals(""))
            {
                    number2  = Double.parseDouble(startDisplay);
                    
                    if(mathOperation == '+')
                    {
                            result = number1 + number2;
                    }
                    else if(mathOperation == '-')
                    {
                            result = number1 - number2;
                    }
                    else if(mathOperation == '*')
                    {
                            result = number1 * number2;
                    }
                    else if(mathOperation == '/')
                    {
                            result = number1 / number2;
                    }
                    else if(mathOperation == '%')
                    {
                            result = number1 % number2;
                    }
                    else
                    {
                            result = number2;
                    }
                    String temp = "";
                    if(isDeci || mathOperation == '/')
                    {
                            displayResult.setText("" + result);
                            temp = ""+result;
                    }
                    else if(!isDeci)
                    {
                            displayResult.setText("" + (long)result);
                            temp = "" + (long)result;
                    }
                    startDisplay = "";
                    number1 = result;
                    plus = true;
                    isDeci = false;
                    isMathOperation = true;
                    startInput += " = ";
                    calcInput.setText(startInput);
                    startInput = temp;
                    mathOperation = '=';
            }

            else if (e.getSource() == clear)
            {
                    number1 = number2 = result = 0;
                    startDisplay = "";
                    mathOperation = ' ';
                    displayResult.setText("0");
                    isDeci = false;
                    plus = true;
                    isMathOperation = false;
                    startInput = "";
                    calcInput.setText("0");
            } 
            else if (e.getSource() == sqaureNum && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.pow(number1, 2);
                    String temp = "";
                    if(!isDeci)
                    {
                            displayResult.setText("" + (long)result);
                            temp = "" + (long)result;
                    }
                    else 
                    {
                            displayResult.setText("" + result);
                            temp = "" + result;
                    }
                    startInput += "^2 = ";
                    calcInput.setText(startInput);
                    startInput = temp;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = false;
                    isMathOperation = true;
                    plus = true;
            } 
            else if (e.getSource() == squareNum2 && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.sqrt(number1);
                    startInput =  "\u221A" + startInput;
                    calcInput.setText(startInput);
                    displayResult.setText(""+result);
                    startInput = ""+result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if (e.getSource() == cubeNum && !startDisplay.equals("")) 
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.pow(number1, 3);
                    String temp = "";
                    if(!isDeci)
                    {
                            displayResult.setText("" + (long)result);
                            temp = "" + (long)result;
                    }
                    else 
                    {
                            displayResult.setText("" + result);
                            temp = "" + result;
                    }
                    startInput +="^3 = ";
                    calcInput.setText(startInput);
                    startInput = temp;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = false;
                    isMathOperation = true;
                    plus = true;
                    
            }
            else if (e.getSource() == oneDivNum && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = 1 / number1;
                    if(isDeci)
                    {
                            startInput = "1 / " + number1;
                    }
                    else 
                    {
                            startInput = "1 / " + (long)number1;
                    }
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    startDisplay = "";
                    startInput = ""+result;
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == percent && !startDisplay.equals("") && mathOperation=='*')
            {
                    number2  = Double.parseDouble(startDisplay);
                    result = number1 * (number2 / 100);
                    
                    startInput = number1 + " \u00D7 "+ number2 + "%";
                    calcInput.setText(startInput);
                    
                    displayResult.setText("" + result);
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    plus = true;
                    isMathOperation = true;
                    isDeci = true;
                    startInput = ""+result;
            }
            else if(e.getSource() == sin && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    
                    if(number1 == 30)
                    {
                            result = Math.sin(Math.toRadians(number1)) + 0.01;
                    }
                    else
                    {
                            result = Math.sin(Math.toRadians(number1));
                    }
                    startInput =  "sin("+startInput+")";
                    calcInput.setText(startInput);
                    
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == cos && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    if(number1 == 60)
                    {
                            result = Math.cos(Math.toRadians(number1)) - 0.01;
                    }
                    else if (number1 == 90)
                    {
                            result = 0;
                    }
                    else 
                    {
                            result = Math.cos(Math.toRadians(number1));
                    }
                    
                    startInput =  "cos("+startInput+")";
                    calcInput.setText(startInput);
                    
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == tan && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    if(number1 == 45)
                    {
                            result = Math.tan(Math.toRadians(number1)) + 0.01;
                    }
                    else
                    {
                            result = Math.tan(Math.toRadians(number1));
                    }
                    
                    startInput =  "tan("+startInput+")";
                    calcInput.setText(startInput);
                    
                    if(number1 != 90)
                    {
                            displayResult.setText("" + result);
                    }
                    
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == sinH && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.sinh(Math.toRadians(number1));
                    startInput =  "sinh("+startInput+")";
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == cosH && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.cosh(Math.toRadians(number1));
                    startInput =  "cosh("+startInput+")";
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == tanH && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.tanh(Math.toRadians(number1));
                    startInput =  "tanH("+startInput+")";
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == aSin && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.asin(Math.toRadians(number1));
                    startInput =  "asin("+startInput+")";
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == aCos && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.acos(Math.toRadians(number1));
                    startInput =  "acos("+startInput+")";
                    calcInput.setText(startInput);
                    
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == aTan && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.atan(Math.toRadians(number1));
                    startInput =  "atan("+startInput+")";
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == log && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.log10(number1);
                    startInput =  "log"+startInput;
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == ln && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.log(number1);
                    startInput =  "ln"+startInput;
                    calcInput.setText(startInput);
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    startDisplay = "";
                    
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == abs && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.abs(number1);
                    startInput =  "abs("+startInput+")";
                    calcInput.setText(startInput);
                    
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    startDisplay = "";
                    
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == powerTen && !startDisplay.equals(""))
            {
                    number1 = Double.parseDouble(startDisplay);
                    result = Math.pow(10, number1);
                    startInput =  "10^"+startInput;
                    calcInput.setText(startInput);
                    
                    displayResult.setText("" + result);
                    startInput = "" + result;
                    startDisplay = "";
                    number1 = result;
                    mathOperation = '=';
                    isDeci = true;
                    isMathOperation = true;
                    plus = true;
            }
            else if(e.getSource() == exit)
            {
                    System.exit(0);
            }
    }
  
}