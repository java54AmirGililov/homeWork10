	package telran.util.test;
	
	import java.util.Comparator;
	
	public class EvenOddComparator implements Comparator<Integer> {
	
		@Override
		public int compare(Integer o1, Integer o2) {
			
	        boolean num1 = o1 % 2 == 0;
	        boolean num2 = o2 % 2 == 0;

	        if (num1 && num2) {
	            return o1.compareTo(o2);
	        } else if (!num1 && !num2) {
	            return o2.compareTo(o1);
	        } else {
	            return num1 ? -1 : 1;
	        }
	    }
	}
	
