public class tuesdays{
  
  
  public static void main(String arg[]){
    String checking = "A Man, A Plan, A Canal-Panama!";
    tuesdays t=new tuesdays();
    if(t.palindrome){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
  }
  public boolean palindromeCheck(String checking) { // Rushabh's Method
		boolean validity=false;//predicting that the string is not palindrome
		int counter=0;//Intializing a counter
		for(int i=0;i<checking.length();i++) {
			for(int j=checking.length()-1;j>=0;j--) {
				if(checking.charAt(i) == checking.charAt(j)) {
					counter++;//Checking howmany characters are matching
					break;
				}
			}
		}
		if(counter==checking.length()) { // if the counter and the length of the string matches 
			validity=true;//makes the boolean true
		}
		return validity;
	}




	public static boolean check_palindrome(String palindrome)	//Martin Lennan's method
	{
		palindrome = palindrome.replaceAll(" |,|-", "");
		palindrome = palindrome.toLowerCase();
		boolean continue_check = true;
		for (int current_check = 0; (current_check < palindrome.length()/2) && continue_check; current_check++)
		{
			if (palindrome.charAt(current_check) != palindrome.charAt(palindrome.length()-current_check-1) )
				return false;
		}
        return true;
	}

}
