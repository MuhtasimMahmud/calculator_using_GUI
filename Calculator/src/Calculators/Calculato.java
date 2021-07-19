package Calculators;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculato {

	private JFrame frame;
	private JTextField textField;
	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculato window = new Calculato();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 242, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma",Font.PLAIN , 20));
		txtDisplay.setBounds(10, 11, 218, 39);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		
		
		//................Row1..................
		
		JButton btnBackSpace = new JButton("<");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String backspace = null;
				
				if(txtDisplay.getText().length()>0) 
				{
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
					
				}
			}
		});
		btnBackSpace.setBounds(10, 54, 50, 50);
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtDisplay.setText(null);
			}
		});
		btnClear.setBounds(66, 54, 50, 50);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnClear);
		
		
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setBounds(122, 54, 50, 50);
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(178, 54, 50, 50);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPlus);
		
		
		
		//................Row2..................
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setBounds(10, 110, 50, 50);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setBounds(66, 110, 50, 50);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setBounds(122, 110, 50, 50);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setBounds(178, 110, 50, 50);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSub);
		
		
		
		//................Row3..................
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setBounds(10, 166, 50, 50);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String EnterNumber = txtDisplay.getText()+ btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setBounds(66, 166, 50, 50);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setBounds(122, 166, 50, 50);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setBounds(178, 166, 50, 50);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnMult);
		
		
		
		//................Row4..................
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setBounds(10, 222, 50, 50);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setBounds(66, 222, 50, 50);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String EnterNumber = txtDisplay.getText()+ btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setBounds(122, 222, 50, 50);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setBounds(178, 222, 50, 50);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDiv);
		
		
		//................Row5..................
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+ btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setBounds(10, 278, 50, 50);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(66, 278, 50, 50);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+") 
				{
					result = firstnum+secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-") 
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);					
				}
				else if(operations == "*") 
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);	
				}
				else if(operations == "/") 
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);	
				}
				else if(operations == "%") 
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);	
				}
				
				
				
			}
		});
		btnEqual.setBounds(122, 278, 106, 50);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnEqual);
		
	}
}
