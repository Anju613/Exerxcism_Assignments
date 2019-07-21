public class Palindrome {
    public boolean check(String sentence) {
      
    	sentence = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    	int strlen = sentence.length(),flag =0;
    	
    	for (int i = 0;i<= (strlen-1)/2 && strlen!=0; i++ ) {

    		if (sentence.charAt(i) != sentence.charAt(strlen-1-i)){
    			flag = 1;
    			break;
    		}

    	}
    	if (flag == 0)
    		return true;    		
    	else 
        	return false;
    }
}
