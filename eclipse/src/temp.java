import java.util.ArrayList;
import java.util.List;


public class temp {

	
	public static void main(String[] args) {
		List<Character> charList = new ArrayList<Character>();
		String myString = "a";
		
		char[] charArray = myString.toCharArray();
		for(char c : charArray){
			charList.add(c);
		}
		
		for (int i=0;i<charList.size();i++){
			char b = 'b';
			charList.add(i,b);
		}
		
		String solution = charList.toString();
		
		
		
		System.out.println(solution);
	}
}
