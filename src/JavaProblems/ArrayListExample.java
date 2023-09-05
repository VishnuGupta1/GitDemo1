package JavaProblems;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array={"Java","Python","PHP","C++"};  
		ArrayList<String>list = new ArrayList<String>();
		for(String lang:array){  
			list.add(lang);  
			}  
			System.out.println("Printing List: "+list);  
			  
			}  

}
