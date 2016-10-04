import java.util.Scanner;

public class FindFirstRepeatingLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a String");
		
		String test = scan.next();
		System.out.println("The first repeating letter is " + returnFirstRepeatingLetter(test));
	}
	
	public static String returnFirstRepeatingLetter(String s) {
		//If s is empty return null directly.
		if(s.isEmpty()) {
			return null;
		}

		String letter = "";
		int index = 0;
		int length = s.length();

		while(index != length) {
			for(int i=index+1; i<length; i++) {
				if(s.charAt(index) == s.charAt(i)) {
					return Character.toString(s.charAt(index));
				}
			}
			index++;
		}
		return null;
	} 
}


		if(s.isEmpty()) {
			return null;
		}
        
        Map<Character, Integer> map = new HashMap<>(); // c -> first appeared pos
        int curPos = Integer.MAX_VALUE;
        char curC = '-'; // init
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                // no duplicate
                map.put(c, i);
            } else if (map.get(c) > curPos) {
                continue;
            } else {
                int firstPos = map.get(c);
                if (firstPos == 0) return c + "";
                if (firstPos < curPos) {
                    // update
                    curPos = firstPos;
                    curC = c;                    
                }

            }
        }
        
        return curPos < s.length() ? curC + "" : "";
        