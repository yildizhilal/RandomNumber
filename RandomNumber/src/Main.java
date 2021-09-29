import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int value;
		int count=0;
		int size=9;
		List<Integer> list=new ArrayList<Integer>(); 
		Random randNum = new Random();
	      while (list.size() < size) {
	    	  value=randNum.nextInt(9)+1;
	    	  count++;
	    	  if(list.contains(value))
	    	  {
	    		  continue;
	    	  }
	         list.add(value);
	      }
	      System.out.println(list+"Random fonksiyonu "+ count+" kere calismistir.");
	   }
}


