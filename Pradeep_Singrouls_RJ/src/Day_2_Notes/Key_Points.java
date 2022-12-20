package Day_2_Notes;

public class Key_Points {
	
	public static void main(String[] args) {
		/*
		 * only class level variable have default value ,
		 *  if we declare a Local variable than must need to provide initialization other it give error;
		 */
		
		
		int i = 10;
		int j;
		if(i==10) {
			j=20;
		}else {
			j = 40;
		}
		System.out.println(j);//The local variable j may not have been initialized
	}

}
