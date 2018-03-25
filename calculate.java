package programmer_calculator;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class calculate extends JFrame {
	
	 /*
	 * 
	 * 定义计算器界面
	 * 
	 */
	static JTextField resultline = new JTextField("0",40);
	static JButton data0 = new JButton("0");
	static JButton data1 = new JButton("1");
	static JButton data2 = new JButton("2");
	static JButton data3 = new JButton("3");
    static JButton data4 = new JButton("4");
    static JButton data5 = new JButton("5");
    static JButton data6 = new JButton("6");
    static JButton data7 = new JButton("7");
    static JButton data8 = new JButton("8");
    static JButton data9 = new JButton("9");
    static JButton point = new JButton(".");
    static JButton equ = new JButton("=");
    static JButton plus = new JButton("+");
    static JButton minus = new JButton("-");
    static JButton mtp = new JButton("*");
    static JButton dvd = new JButton("/");
    static JButton and = new JButton("and");
    static JButton or = new JButton("or");
    static JButton xor = new JButton("xor");
    static JButton not = new JButton("not");
    static JButton bs = new JButton("backspace");
    
    JRadioButton jrb1;
    JRadioButton jrb2;
    JRadioButton jrb3;
    JRadioButton jrb4;
	
    static JPanel jp = new JPanel();
    
    Container c = getContentPane() ;
    
    private void init()
    {
    	jrb1 = new JRadioButton("二进制");
    	jrb2 = new JRadioButton("八进制");
    	jrb3 = new JRadioButton("十进制");
    	jrb4 = new JRadioButton("十六进制");
    	
    	ButtonGroup bg = new ButtonGroup();
    	bg.add(jrb1);
    	bg.add(jrb2);
    	bg.add(jrb3);
    	bg.add(jrb4);

    	jp.setLayout(new GridLayout(5,5,5,5));
    	resultline.setHorizontalAlignment(JTextField.RIGHT);
    	setLayout(new GridLayout(2,1));
    	
    	jp.add(jrb1);
    	jp.add(jrb2);
    	jp.add(jrb3);
    	jp.add(jrb4);
    	jp.add(bs);
    	jp.add(data7);
        jp.add(data8);
        jp.add(data9);
        jp.add(plus);
        jp.add(and);
        jp.add(data4);
        jp.add(data5);
        jp.add(data6);
        jp.add(minus);
        jp.add(or);
        jp.add(data1);
        jp.add(data2);
        jp.add(data3);
        jp.add(mtp);
        jp.add(xor);
        jp.add(point);
        jp.add(data0);
        jp.add(equ);
        jp.add(dvd);
        jp.add(not);
        c.add(resultline);
        c.add(jp);
        setSize(400,300);
        setTitle("计算器");
        setVisible(true);
        setResizable(false);//不能自由改变大小
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        data0.addActionListener(new ActionListener(){//数字0的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"0");   
                }
            }
        });
        
        data1.addActionListener(new ActionListener(){//数字1的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("1");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"1");
                }
            }
        });
        
        data2.addActionListener(new ActionListener(){//数字2的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("2");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"2");
                }
            }
        });
        
        data3.addActionListener(new ActionListener(){//数字3的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("3");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"3");
                }
            }
        });
        
        data4.addActionListener(new ActionListener(){//数字4的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("4");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"4");
                }
            }
        });
        
        data5.addActionListener(new ActionListener(){//数字5的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("5");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"5");
                }
            }
        });
        
        data6.addActionListener(new ActionListener(){//数字6的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("6");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"6");
                }
            }
        });
        
        data7.addActionListener(new ActionListener(){//数字7的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("7");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"7");
                }
            }
        });
        
        data8.addActionListener(new ActionListener(){//数字8的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("8");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"8");
                }
            }
        });
        
        data9.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("9");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"9");
                }
            }
        });
        
        plus.addActionListener(new ActionListener(){//+的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("+");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"+");
                }
            }
        });
        
        minus.addActionListener(new ActionListener(){//-的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("-");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"-");
                }
            }
        });
        
        mtp.addActionListener(new ActionListener(){//*的输入
            public void actionPerformed(ActionEvent arg0){
                    String str = resultline.getText();
                    resultline.setText(str+"*");
            }
        });
        
        dvd.addActionListener(new ActionListener(){// /的输入
            public void actionPerformed(ActionEvent arg0){
                    String str = resultline.getText();
                    resultline.setText(str+"/");
            }
        });
        
        and.addActionListener(new ActionListener(){// &的输入
            public void actionPerformed(ActionEvent arg0){
                    String str = resultline.getText();
                    resultline.setText(str+"&");
            }
        });
        
        or.addActionListener(new ActionListener(){// |输入
            public void actionPerformed(ActionEvent arg0){
                    String str = resultline.getText();
                    resultline.setText(str+"|");
            }
        });
        
        xor.addActionListener(new ActionListener(){// ^的输入
            public void actionPerformed(ActionEvent arg0){
                    String str = resultline.getText();
                    resultline.setText(str+"^");
            }
        });
        
        not.addActionListener(new ActionListener(){// ~的输入
            public void actionPerformed(ActionEvent arg0){
            	if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("~");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"~");
                }
            }
        });
        
        equ.addActionListener(new ActionListener(){// =的输入
            public void actionPerformed(ActionEvent arg0){
            	getInput();
            	s = 0;
            	expression();
            	resultline.setText("");
            	resultline.setText(String.valueOf(stack[1]));
            }
        });
        
        bs.addActionListener(new ActionListener(){//backspace
            public void actionPerformed(ActionEvent arg0){
                    String str = resultline.getText();
                    if(str.length() > 1)
                    {
                    	str = str.substring(0,str.length() - 1);
                    	resultline.setText(str);
                    }
                    else
                    	resultline.setText("0");
                }
        });
    }
	/*
	 * 
	 * 
	 * 
	 * 计算处理部分
	 * 
	 * 
	 * 
	 */

	private static int d = 10;
	
	private static String operator = "+-*/&|~^";
	
	private static String paren = "()";
	
	private static int LpNum = 0;
	
	private static String buffer = "";
	
	private static char lastChar = ' ';
	
	private String resultText = "0";
	
	private static String dictionary = "";
	
	private final int maxLen = 20;
	
	private static  int [] stack = new int[255];
	
	private static int top = 0;
	
	private static char ch;
	
	public static int s = 0;
	
	private static int getpress(char c)
	{
		if (dictionary.indexOf(c) != -1 || paren.indexOf(c) != -1) 
		  buffer += c;
		else if(c == '=')
		  {
			lastChar = ' ';
			return 1;
		  }
		else if(operator.indexOf(c) != -1 && operator.indexOf(lastChar) == -1)
		  {
			if(buffer == "" && c != '-')
				buffer += 0;
			buffer += c;
		  }
		else if(operator.indexOf(c) != -1)
		{
		  buffer = buffer.substring(0,buffer.length() - 1);
		  buffer += c;
		}
		lastChar = c;
        return 0;
    }
	
	public static void getInput()
	{
		LpNum = 0;
		dictionary = "";
		if(d == 10)
			dictionary += "0123456789";
		else if(d == 2)
			dictionary += "01";
		else if(d == 8)
			dictionary += "012345678";
		else if(d == 16)
			dictionary += "0123456789abcdABCD";
		String str = resultline.getText();
		str += "=";
		char c;
		int i = 0;
		int l = str.length();
		buffer = "";
		while(i < l)
		{
            c = str.charAt(i);
            getpress(c);
            i += 1;
		}
		top = 0;
		stack[0] = 0;
		stack[1] = 0;
	}
	
	public static void error(int i)
	{
		if(i == 1)
		 System.out.println(" error1:missing \")\"\n ");
		if(i == 2)
		 System.out.println(" error1:missing \"(\"\n ");
	}
	
	public static void expression()
	{
	   int statement = 0;
	   int num = 0 , l = buffer.length();
	   while(s < l)
	   {
           ch = buffer.charAt(s);
           s += 1;
           while(dictionary.indexOf(ch) != -1)
           {
        	   statement = 1;
        	   num *= d;
        	   if("abcdef".indexOf(ch) != -1)
        		   num += (int)ch - 'a' + 10;
        	   else if("ABCDEF".indexOf(ch) != -1)
        		   num += (int)ch - 'A' + 10;
        	   else
        		   num += (int)ch - '0';
        	   if(s < l)
        	   {
        		   ch = buffer.charAt(s);
        		   s += 1;
        	   }
        	   else
        		   ch = ' ';
           }
           if(statement == 1)
           {
        	   statement = 0;
        	   top += 1;
        	   stack[top] = num;
        	   num = 0;
           }
           if(ch == ')')
           {
        	   if(LpNum > 0)
        	     break;
        	   else
        		 error(2);
           }
           if(ch == '(')
           {
        	   LpNum += 1;
        	   expression();
        	   if(ch != ')')
        		   error(1);
           }
           if(ch == '+')
           {
        	  term(); 
        	  if(top > 1)
        	  {
        		  stack[top-1] += stack[top]; 
        		  top -= 1;
        	  }
           }
           if(ch == '-')
           {
        	  term(); 
        	  if(top > 1)
        	  {
        		  stack[top-1] -= stack[top]; 
        		  top -= 1;
        	  }
        	  else
        		  stack[1] = -stack[top];
           }
           if(ch == '*')
           {
               factor();
        	   stack[top-1] *= stack[top]; 
        	   top -= 1;
           }
           if(ch == '/')
           {
        	   factor();
        	   stack[top-1] /= stack[top]; 
        	   top -= 1;
           }
           if(ch == '&')
           {
        	   factor();
        	   stack[top-1] &= stack[top]; 
        	   top -= 1;
           }
           if(ch == '|')
           {
        	   factor();
        	   stack[top-1] |= stack[top]; 
        	   top -= 1;
           }
           if(ch == '^')
           {
        	   factor();
        	   stack[top-1] ^= stack[top]; 
        	   top -= 1;
           }
	   }
	}
	
	public static void term()
	{
	   int statement = 0;
	   int num = 0 , l = buffer.length();
	   while(s < l)
	   {
           ch = buffer.charAt(s);
           s += 1;
           while(dictionary.indexOf(ch) != -1)
           {
        	   statement = 1;
        	   num *= d;
        	   if("abcdef".indexOf(ch) != -1)
        		   num += (int)ch - 'a' + 10;
        	   else if("ABCDEF".indexOf(ch) != -1)
        		   num += (int)ch - 'A' + 10;
        	   else
        		   num += (int)ch - '0';
        	   if(s < l)
        	   {
        		   ch = buffer.charAt(s);
        		   s += 1;
        	   }
        	   else
        		   ch = ' ';
           }
           if(statement == 1)
           {
        	   statement = 0;
        	   top += 1;
        	   stack[top] = num;
        	   num = 0;
           }
           if(ch == '(')
           {
        	   LpNum += 1;
        	   expression();
        	   if(ch != ')')
        		   error(1);
        	   else
        		   break;
           }
           if(ch == '+' || ch == '-' || ch == ')')
           {
        	   s -= 1;
         	  break;
           }
           if(ch == '*')
           {
        	   factor();
        	   stack[top-1] *= stack[top]; 
        	   top -= 1;
           }
           if(ch == '/')
           {
        	   factor();
        	   stack[top-1] /= stack[top]; 
        	   top -= 1;
           }
           if(ch == '&')
           {
        	   factor();
        	   stack[top-1] &= stack[top]; 
        	   top -= 1;
           }
           if(ch == '|')
           {
        	   factor();
        	   stack[top-1] |= stack[top]; 
        	   top -= 1;
           }
           if(ch == '^')
           {
        	   factor();
        	   stack[top-1] ^= stack[top]; 
        	   top -= 1;
           }
	   }
	}
	
	public static void factor()
	{
	   int statement = 0;
	   int num = 0 , l = buffer.length();
           ch = buffer.charAt(s);
           s += 1;
           while(dictionary.indexOf(ch) != -1)
           {
        	   statement = 1;
        	   num *= d;
        	   if("abcdef".indexOf(ch) != -1)
        		   num += (int)ch - 'a' + 10;
        	   else if("ABCDEF".indexOf(ch) != -1)
        		   num += (int)ch - 'A' + 10;
        	   else
        		   num += (int)ch - '0';
        	   if(s < l)
        	   {
        		   ch = buffer.charAt(s);
        		   s += 1;
        	   }
        	   else
        		   ch = ' ';
           }
           if(statement == 1)
           {
        	   statement = 0;
        	   top += 1;
        	   stack[top] = num;
        	   num = 0;
           }
           if(ch == '(')
           {
        	   LpNum += 1;
        	   expression();
        	   if(ch != ')')
        		   error(1);
           }
           s-=1;
	}
	
	public calculate()
	{
		super();
		init();
	}
	

	public static void main(String args[])
	{
		calculate c = new calculate();
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
