package quiz;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String a = "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";

	int numChar =a.length();
    System.out.println("number of characters in string:  "+numChar);
    
    System.out.println("last 15 character: " + a.substring(a.length() - 14)); 
          	
    
    char someChar1 = 'c';
    int count1 = 0;
      
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == someChar1) {
            count1++;
        }
    }
   
    System.out.println("number of times for c : "+count1);	
		
    char someChar2 = 'p';
    int count2 = 0;
      
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == someChar2) {
            count2++;
        }
    }
   
    System.out.println("number of times for c : "+count2);		
		
		
		
		
		
		
		
		
		
	}

}
