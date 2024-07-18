package String;



public class removeduplicatefromstring {
	public static void main(String[] args) {
        String str = "kavinvikram"; 
        String uniqueStr = removeDuplicates(str);
        System.out.println("String without duplicates: " + uniqueStr);
    }

	 public static String removeDuplicates(String str) {
	        char[] chars = str.toCharArray();
	        StringBuilder uniqueStr = new StringBuilder();
	        for (char c : chars) {
	            if (!uniqueStr.toString().contains(String.valueOf(c))) {
	                uniqueStr.append(c);
	            }
	        }
	        return uniqueStr.toString();
	    }
	}




