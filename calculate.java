package programmer_calculator;

import java.io.IOException;

public class calculate {

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
	
	private static int getpress() throws IOException 
	{
		char c = (char)System.in.read();
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
	
	public static void getInput() throws IOException
	{
		dictionary = "";
		if(d == 10)
			dictionary += "0123456789";
		else if(d == 2)
			dictionary += "01";
		else if(d == 8)
			dictionary += "012345678";
		else if(d == 16)
			dictionary += "0123456789abcdABCD";
		while(getpress() == 0);
		top = 0;
		stack[0] = 0;
	}
	
	public static void error(int i)
	{
		if(i == 1)
		 System.out.println(" error1:missing \")\"\n ");
		if(i == 2)
		 System.out.println(" error1:missing \"(\"\n ");
	}
	
	public static void expression() throws IOException
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
        		  stack[top] = -stack[top];
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
	
	public static void term() throws IOException
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
	
	public static void factor() throws IOException
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
           if((operator.indexOf(ch) != -1 && ch != '~') || ch == ')')
           {
        	   s -= 1;
        	   break;
           }
	   }
	}
	

	public static void main(String args[])
	{
		try {
			getInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			expression();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("result is  " + stack[1] + "  " + buffer);
	}
}
