package programmer_calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	static JTextField resultline = new JTextField("0",2);
	static JTextField lastline = new JTextField("",2);
	static JTextField t1 = new JTextField("",2);
	static JTextField t2 = new JTextField("",2);
	static JTextField t3 = new JTextField("",2);
	
	static JButton da = new JButton("a");
	static JButton db = new JButton("b");
	static JButton dc = new JButton("c");
	static JButton dd = new JButton("d");
	static JButton de = new JButton("e");
	static JButton df = new JButton("f");
	
	static JButton sl = new JButton("lsh");
	static JButton sr = new JButton("rsh");

    
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
    static JButton cl = new JButton("C");
    static JButton mod = new JButton("mod");
    
    JRadioButton jrb1;
    JRadioButton jrb2;
    JRadioButton jrb3;
    JRadioButton jrb4;
    JRadioButton jrb5;
    JRadioButton jrb6;
    JRadioButton jrb7;
    JRadioButton jrb8;
    
    static JPanel jp = new JPanel();
    
    Container c = getContentPane() ;
    
    private void init()
    {
    	jrb1 = new JRadioButton("B");
    	jrb2 = new JRadioButton("O");
    	jrb3 = new JRadioButton("D");
    	jrb4 = new JRadioButton("H");
    	
    	jrb5 = new JRadioButton("byte");
    	jrb6 = new JRadioButton("word");
    	jrb7 = new JRadioButton("dword");
    	jrb8 = new JRadioButton("qword");
    	
    	ButtonGroup bg = new ButtonGroup();
    	bg.add(jrb1);
    	bg.add(jrb2);
    	bg.add(jrb3);
    	bg.add(jrb4);
    	
    	ButtonGroup bg1 = new ButtonGroup();
    	bg1.add(jrb5);
    	bg1.add(jrb6);
    	bg1.add(jrb7);
    	bg1.add(jrb8);

    	jp.setLayout(new GridLayout(7,6,5,5));
    	resultline.setHorizontalAlignment(JTextField.RIGHT);
    	setLayout(new GridLayout(2,1));

    	lastline.setHorizontalAlignment(JTextField.RIGHT);
    	JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.add("North", lastline);
        top.add("Center", resultline);
        top.setLayout(new GridLayout(2,5));
        
        t1.setHorizontalAlignment(JTextField.LEFT);
        t2.setHorizontalAlignment(JTextField.LEFT);
        t3.setHorizontalAlignment(JTextField.LEFT);
        jp.add(t1);
        jp.add(t2);
        jp.add(t3);
        jp.add(bs);
        jp.add(mod);
        jp.add(cl);
    	
    	jp.add(jrb1);
    	jp.add(jrb2);
    	jp.add(jrb3);
    	jp.add(jrb4);
    	jp.add(sr);
    	jp.add(da);
    	
    	jp.add(jrb5);
    	jp.add(jrb6);
    	jp.add(jrb7);
    	jp.add(jrb8);
    	jp.add(sl);
    	jp.add(db);
    	
    	jp.add(data7);
        jp.add(data8);
        jp.add(data9);
        jp.add(plus);
        jp.add(and);
        jp.add(dc);
        
        jp.add(data4);
        jp.add(data5);
        jp.add(data6);
        jp.add(minus);
        jp.add(or);
        jp.add(dd);
        
        jp.add(data1);
        jp.add(data2);
        jp.add(data3);
        jp.add(mtp);
        jp.add(xor);
        jp.add(de);
        
        jp.add(point);
        jp.add(data0);
        jp.add(equ);
        jp.add(dvd);
        jp.add(not);
        jp.add(df);
        c.add(top);
        c.add(jp);
        setSize(720,480);
        setTitle("Calculator");
        setVisible(true);
        setResizable(false);//不能自由改变大小
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        equ.setForeground(Color.red);
        plus.setForeground(Color.red);
        minus.setForeground(Color.red);
        mtp.setForeground(Color.red);
        dvd.setForeground(Color.red);
        and.setForeground(Color.green);
        or.setForeground(Color.green);
        xor.setForeground(Color.green);
        not.setForeground(Color.green);
        sl.setForeground(Color.pink);
        sr.setForeground(Color.pink);
        mod.setForeground(Color.gray);
        cl.setForeground(Color.yellow);
        bs.setForeground(Color.blue);
        
        da.setEnabled(false);
        db.setEnabled(false);
        dc.setEnabled(false);
        dd.setEnabled(false);
        de.setEnabled(false);
        df.setEnabled(false);
        point.setEnabled(false);
        
        jrb1.addItemListener(new ItemListener() {
      	@Override
        	public void itemStateChanged(ItemEvent e) {
        	if (jrb1.isSelected()) {
        		t1.setText("");
        		t2.setText("");
        		t3.setText("");
        		String str = resultline.getText();
        		if(str.matches(dictionary)) {
        		int r = Integer.valueOf(str, d);
        		resultline.setText(Integer.toBinaryString(r));
        	}
        	else
        		resultline.setText("0");
        	}
            d = 2;
            dictionary = "01";
            da.setEnabled(false);
            db.setEnabled(false);
            dc.setEnabled(false);
            dd.setEnabled(false);
            de.setEnabled(false);
            df.setEnabled(false);
            data2.setEnabled(false);
            data3.setEnabled(false);
            data4.setEnabled(false);
            data5.setEnabled(false);
            data6.setEnabled(false);
            data7.setEnabled(false);
            data8.setEnabled(false);
            data9.setEnabled(false);
        	}
        	});
        
        jrb2.addItemListener(new ItemListener() {
      	@Override
        	public void itemStateChanged(ItemEvent e) {
        	if (jrb2.isSelected()) {
        		t1.setText("");
        		t2.setText("");
        		t3.setText("");
        		String str = resultline.getText();
        		if(str.matches(dictionary)) {
        		int r = Integer.valueOf(str, d);
        		resultline.setText(Integer.toOctalString(r));
        	}
        	else
        		resultline.setText("0");
         	   d = 8;
         	   dictionary = "01234567";
         	  da.setEnabled(false);
              db.setEnabled(false);
              dc.setEnabled(false);
              dd.setEnabled(false);
              de.setEnabled(false);
              df.setEnabled(false);
              data2.setEnabled(true);
              data3.setEnabled(true);
              data4.setEnabled(true);
              data5.setEnabled(true);
              data6.setEnabled(true);
              data7.setEnabled(true);
              data8.setEnabled(false);
              data9.setEnabled(false);
        	}
        	}
        	});
        
        jrb3.addItemListener(new ItemListener() {
      	@Override
        	public void itemStateChanged(ItemEvent e) {
        	if (jrb3.isSelected()) {
        		t1.setText("");
        		t2.setText("");
        		t3.setText("");
        		String str = resultline.getText();
        		if(str.matches(dictionary)) {
        		int r = Integer.valueOf(str, d);
        		resultline.setText(Integer.toString(r));
        	}
        	else
        		resultline.setText("0");
        	}
        	   d = 10;
               dictionary = "0123456789";
          	  da.setEnabled(false);
              db.setEnabled(false);
              dc.setEnabled(false);
              dd.setEnabled(false);
              de.setEnabled(false);
              df.setEnabled(false);
              data2.setEnabled(true);
              data3.setEnabled(true);
              data4.setEnabled(true);
              data5.setEnabled(true);
              data6.setEnabled(true);
              data7.setEnabled(true);
              data8.setEnabled(true);
              data9.setEnabled(true);
        	}
        	});
        
        jrb4.addItemListener(new ItemListener() {
      	@Override
        	public void itemStateChanged(ItemEvent e) {
        	if (jrb4.isSelected()) {
        		t1.setText("");
        		t2.setText("");
        		t3.setText("");
        		String str = resultline.getText();
        		if(str.matches(dictionary))
        		{
        		  int r = Integer.valueOf(str, d);
        		  resultline.setText(Integer.toHexString(r));
        		}
        		else
        		 resultline.setText("0");
        		   d = 16;
                   dictionary = "0123456789abcdefABCDEF";
               	  da.setEnabled(true);
                  db.setEnabled(true);
                  dc.setEnabled(true);
                  dd.setEnabled(true);
                  de.setEnabled(true);
                  df.setEnabled(true);
                  data2.setEnabled(true);
                  data3.setEnabled(true);
                  data4.setEnabled(true);
                  data5.setEnabled(true);
                  data6.setEnabled(true);
                  data7.setEnabled(true);
                  data8.setEnabled(true);
                  data9.setEnabled(true);
        	}
        	}
        	});
        
        jrb5.addItemListener(new ItemListener() {
          	@Override
            	public void itemStateChanged(ItemEvent e) {
            	if (jrb5.isSelected()) {
            		t1.setText("");
            		t2.setText("");
            		t3.setText("");
            		String str = resultline.getText();
            		 resultline.setText("0");
                    datatype = 8;
            	}
            	}
            	});
        
        jrb6.addItemListener(new ItemListener() {
          	@Override
            	public void itemStateChanged(ItemEvent e) {
            	if (jrb6.isSelected()) {
            		t1.setText("");
            		t2.setText("");
            		t3.setText("");
            		String str = resultline.getText();
            		 resultline.setText("0");
                    datatype = 16;
            	}
            	}
            	});
        
        jrb7.addItemListener(new ItemListener() {
          	@Override
            	public void itemStateChanged(ItemEvent e) {
            	if (jrb7.isSelected()) {
            		t1.setText("");
            		t2.setText("");
            		t3.setText("");
            		String str = resultline.getText();
            		 resultline.setText("0");
                    datatype = 32;
            	}
            	}
            	});
        
        jrb8.addItemListener(new ItemListener() {
          	@Override
            	public void itemStateChanged(ItemEvent e) {
            	if (jrb8.isSelected()) {
            		t1.setText("");
            		t2.setText("");
            		t3.setText("");
            		String str = resultline.getText();
            		 resultline.setText("0");
                    datatype = 64;
            	}
            	}
            	});
        
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
        
        da.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("a");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"a");
                }
            }
        });
        
        db.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("b");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"b");
                }
            }
        });
        
        dc.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("c");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"c");
                }
            }
        });
        
        dd.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("d");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"d");
                }
            }
        });
        
        de.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("e");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"e");
                }
            }
        });
        
        df.addActionListener(new ActionListener(){//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("f");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"f");
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
            	getInput();
            	s = 0;
            	expression();
            	stack[1] = ~stack[1];
            	lastline.setText(buffer);
            	String str = null;
            	int t = 0;
            	switch(datatype)
            	{
            	case 8: t = 0xff; break;
            	case 16: t = 0xffff; break;
            	case 32: t = 0xffffffff; break;
            	case 64:  t = 0xffffffff; break;
            	}
            	if(d == 10)
            	{
              	  str = String.valueOf(stack[1]);
              	  t1.setText("BIN=" + Integer.toBinaryString(stack[1]&t));
              	  t2.setText("OCT=" + Integer.toOctalString(stack[1]&t));
              	  t3.setText("HEX=" + Integer.toHexString(stack[1]&t));
            	}
            	else if(d == 2)
            	{
            		str = Integer.toBinaryString(stack[1]&t);
                	  t1.setText("OCT=" + Integer.toOctalString(stack[1]&t));
                  	  t2.setText("DEC=" + Integer.toString(stack[1]));
                  	  t3.setText("HEX=" + Integer.toHexString(stack[1]&t));
            	}
            	else if(d == 16)
            	{
            		str = Integer.toHexString(stack[1]&t);
            		t1.setText("BIN=" + Integer.toBinaryString(stack[1]&t));
            		t2.setText("OCT=" + Integer.toOctalString(stack[1]&t));
            		t3.setText("DEC=" + Integer.toString(stack[1]));
            	}
            	else if(d == 8)
            	{
            		str = Integer.toOctalString(stack[1]&t);
            		t1.setText("BIN=" + Integer.toBinaryString(stack[1]&t));
            		t2.setText("DEC=" + Integer.toString(stack[1]));
                	t3.setText("HEX=" + Integer.toHexString(stack[1]&t));
            	}
            	resultline.setText(str);
            }
        });
        
        mod.addActionListener(new ActionListener(){// ~的输入
            public void actionPerformed(ActionEvent arg0){
            	if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("%");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"%");
                }
            }
        });
        
        sl.addActionListener(new ActionListener(){// ~的输入
            public void actionPerformed(ActionEvent arg0){
            	if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText("<");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+"<");
                }
            }
        });
        
        sr.addActionListener(new ActionListener(){// ~的输入
            public void actionPerformed(ActionEvent arg0){
            	if(resultline.getText().equals("0")){
                	resultline.setText("");
                	resultline.setText(">");
                	resultline.requestFocus();
                }
                else{
                    String str = resultline.getText();
                    resultline.setText(str+">");
                }
            }
        });
        
        equ.addActionListener(new ActionListener(){// =的输入
            public void actionPerformed(ActionEvent arg0){
            	getInput();
            	s = 0;
            	expression();
            	lastline.setText(buffer);
            	String str = null;
            	int t = 0;
            	switch(datatype)
            	{
            	case 8: t = 0xff; break;
            	case 16: t = 0xffff; break;
            	case 32: t = 0xffffffff; break;
            	case 64:  t = 0xffffffff; break;
            	}
            	if(d == 10)
            	{
              	  str = String.valueOf(stack[1]);
              	  t1.setText("BIN=" + Integer.toBinaryString(stack[1]&t));
              	  t2.setText("OCT=" + Integer.toOctalString(stack[1]&t));
              	  t3.setText("HEX=" + Integer.toHexString(stack[1]&t));
            	}
            	else if(d == 2)
            	{
            		str = Integer.toBinaryString(stack[1]&t);
                	  t1.setText("OCT=" + Integer.toOctalString(stack[1]&t));
                  	  t2.setText("DEC=" + Integer.toString(stack[1]));
                  	  t3.setText("HEX=" + Integer.toHexString(stack[1]&t));
            	}
            	else if(d == 16)
            	{
            		str = Integer.toHexString(stack[1]&t);
            		t1.setText("BIN=" + Integer.toBinaryString(stack[1]&t));
            		t2.setText("OCT=" + Integer.toOctalString(stack[1]&t));
            		t3.setText("DEC=" + Integer.toString(stack[1]));
            	}
            	else if(d == 8)
            	{
            		str = Integer.toOctalString(stack[1]&t);
            		t1.setText("BIN=" + Integer.toBinaryString(stack[1]&t));
            		t2.setText("DEC=" + Integer.toString(stack[1]));
                	t3.setText("HEX=" + Integer.toHexString(stack[1]&t));
            	}
            	resultline.setText(str);
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
        
        cl.addActionListener(new ActionListener(){//backspace
            public void actionPerformed(ActionEvent arg0){
                    	resultline.setText("0");
                    	t1.setText("");
                    	t2.setText("");
                    	t3.setText("");
                    	buffer = "";
                    	lastline.setText("");
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
	
	private static int datatype = 16;
	
	private static String operator = "+-*/&|<>%^";
	
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
			dictionary += "0123456789abcdefABCDEF";
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
			JOptionPane.showMessageDialog(null, "missing \")\"!!");
		if(i == 2)
			JOptionPane.showMessageDialog(null, "missing \"(\"!!");
		if(i == 3)
			JOptionPane.showMessageDialog(null, "overflow");;
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
        	   if(datatype < 32) {
        	   if(num >= Math.pow(2 , datatype))
        	   {
        		   error(3);
        		   break;
        	   }
        	   if(num >= Math.pow(2 , datatype-1))
        	   {
        		   num -= Math.pow(2 , datatype);
        	   }
        	   }
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
       	   if(datatype < 32) {
       	   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
       	   {
       		   error(3);
       		   break;
       	   }
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
        	  if(datatype < 32) {
        		  if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
              	   {
              		   error(3);
              		   break;
              	   }
              	   }
           }
           if(ch == '*')
           {
               factor();
        	   stack[top-1] *= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '/')
           {
        	   factor();
        	   stack[top-1] /= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '&')
           {
        	   factor();
        	   stack[top-1] &= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '|')
           {
        	   factor();
        	   stack[top-1] |= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '^')
           {
        	   factor();
        	   stack[top-1] ^= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '<')
           {
               factor();
        	   stack[top-1] <<= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '>')
           {
               factor();
        	   stack[top-1] >>= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '%')
           {
               factor();
        	   stack[top-1] %= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
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
        	   if(datatype < 32) {
        	   if(num > Math.pow(2 , datatype))
        	   {
        		   error(3);
        		   break;
        	   }
        	   if(num >= Math.pow(2 , datatype-1))
        	   {
        		   num -= Math.pow(2 , datatype);
        	   }
        	   }
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
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '/')
           {
        	   factor();
        	   stack[top-1] /= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '&')
           {
        	   factor();
        	   stack[top-1] &= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '|')
           {
        	   factor();
        	   stack[top-1] |= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '^')
           {
        	   factor();
        	   stack[top-1] ^= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '<')
           {
               factor();
        	   stack[top-1] <<= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '>')
           {
               factor();
        	   stack[top-1] >>= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
           }
           if(ch == '%')
           {
               factor();
        	   stack[top-1] %= stack[top]; 
        	   top -= 1;
        	   if(datatype < 32) {
        		   if(stack[top] >= Math.pow(2 , datatype)-1 || stack[top] < -Math.pow(2 , datatype))
               	   {
               		   error(3);
               		   break;
               	   }
               	   }
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
        	   if(datatype < 32) {
        		   if(num >= Math.pow(2 , datatype))
            	   {
        			   JOptionPane.showMessageDialog(null, "overflow");
            	   }
            	   if(num >= Math.pow(2 , datatype-1))
            	   {
            		   num -= Math.pow(2 , datatype);
            	   }
        	   }
        	   top += 1;
        	   stack[top] = num;
        	   num = 0;
           }
           if(ch == '(')
           {
        	   LpNum += 1;
        	   expression();
        	   if(ch != ')')
        		   JOptionPane.showMessageDialog(null, "missing \")\"!!");
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
