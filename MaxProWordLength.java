import java.util.Arrays;
import java.util.Comparator;
/**
 * @author siying
 * 07/14/2016
 * 318 - medium
 * O(n) = n*n*L (L is the length)
 */
public class MaxProWordLength {
	public static void main(String[] args) {
		String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
		System.out.println("The longest product: " + maxProduct(words));
	}

    public static int maxProduct(String[] words) {
    	int max = 0;
    	
    	//Sort all words according to length
    	Arrays.sort(words, new Comparator<String>() {
    		public int compare(String a, String b) {
    			return b.length()-a.length();
    		}
    	});

    	int[] masks = new int[words.length];	//alphabet masks

    	for(int i=0; i<masks.length; i++) {
    		for(char c:words[i].toCharArray()) {
    			masks[i] |= 1<<(c - 'a');
    		}
    		System.out.println(masks[i]);
    	}

    	for(int i=0; i<masks.length; i++) {
    		if(words[i].length()*words[i].length() <= max) break; //prunning
    		for(int j=i+1; j<masks.length; j++) {
    			if((masks[i] & masks[j]) == 0) {
    				max = Math.max(max, words[i].length()*words[j].length());
    				break;
    			}
    		}
    	} 
    	return max;

    /* 1. O(n) = n*n*L  exceed time limitation
        //No pair of words
        if(words == null || words.length == 0 || words.length == 1) return 0;
        int longest = 0;
        
        List<Character> basic;
        List<Character> compared;
        
        for(int k=0; k<words.length; k++) {
            
            //Initialize with empty
            basic = new ArrayList<Character>();
           
            //Get current array as the base one
            for(int i=0; i<words[k].length(); i++) {
                basic.add(words[k].charAt(i));
                System.out.print(basic.get(i) + " ");
            }
            
            for(int j=k+1; j<words.length; j++) {
                
                //Store every compared one into the arraylist
                compared = new ArrayList<Character>(); 
                for(int l=0; l<words[j].length(); l++) {
                    compared.add(words[j].charAt(l));
                }

                int count=0;
                
                while(count<basic.size()&&!compared.contains(basic.get(count))) {
                    count++;
                }
                //No repeat characters then continue compare to next.
                if(count<basic.size()) 
                    continue;
                else if(longest < basic.size()*compared.size()) {
                    System.out.println(basic.size() + " " + "*" + " " + compared.size());
                    longest = basic.size()*compared.size();
                }
            }
        }
        return longest;*/
    } 
}