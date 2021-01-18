package ejemploTdd.ejemplo2;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConversorRomano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Object intToRoman(int num) {
		// TODO Auto-generated method stub
		Map<String, Integer> miMap = new LinkedHashMap<>();
	      miMap.put("M", 1000);
	      miMap.put("CM",900);
	      miMap.put("D", 500);
	      miMap.put("CD", 400);
	      miMap.put("C", 100);
	      miMap.put("XC", 90);
	      miMap.put("L", 50);
	      miMap.put("XL", 40);
	      miMap.put("X", 10);      
	      miMap.put("IX", 9);
	      miMap.put("V", 5);
	      miMap.put("IV", 4);
	      miMap.put("I", 1);

	      StringBuilder stringBuilder = new StringBuilder();
	      
	      //Traverse a map
	     for(Map.Entry<String, Integer> entry : miMap.entrySet()) { 
	    
	        while(num >= entry.getValue()) {
	          num = num - entry.getValue();
	          stringBuilder.append(entry.getKey());
	        }
	     }

	     return stringBuilder.toString();
	       
	   }
	

}
