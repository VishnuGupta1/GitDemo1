package JavaProblems;

public class DemoStrings {

	
	public static void main(String[] args) {
		
///Two String conctdation 
		/*
	String s1="Vishnu";
	String s2="Kumar";
	
	System.out.println("Before adding both string char:"+(s1.concat(s2)));//SeleniumTesting
	System.out.println("After adding:" +s1);
		System.out.println(s1);
	*/
		//Outpur:  Vishnu
		
//Reverse of string using third variable
		
		/*
		String Str="Indian FLAG",nstr="";
		char ch;
		
		System.out.println("Original word:" +Str);
		for(int i=0;i<Str.length();i++)
		{
			ch=Str.charAt(i);
		nstr=ch+nstr;
		
		}
		System.out.println("After reverse the String:"+nstr);
		*/
		
//Without using third variable
		String text="India First";
		StringBuilder ReString=new StringBuilder();
		ReString.append(text);
		ReString.reverse();
		System.out.println(ReString);
		
		
		
		
		
		
		
		
	}
	}
	

