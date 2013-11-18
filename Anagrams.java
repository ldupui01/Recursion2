
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrams {
	
	
	public void reshuffle(String myString){
		int sizeStr = myString.length();
		
		List<Character> charList = new ArrayList<Character>();
		List<String> stringList = new ArrayList<String>();
		
		for (int i = 0; i<sizeStr; i++){
			List<Character> charListAux = new ArrayList<Character>();
			String anagram = "" ;
			char[] charArray = myString.toCharArray();
			for(char c : charArray){
				charList.add(c);
			}

			while (charList.size() > 0){
				int x = (int)(Math.random() * charList.size());
				charListAux.add(charList.get(x));
				charList.remove(x);
			}
			
			for (int j=0; j<charListAux.size();j++){
				anagram += charListAux.get(j);
			}
			stringList.add(anagram);
		}
		
		for (int y = 0; y<stringList.size();y++){
			System.out.println(stringList.get(y));
		}
	}
	
	public ArrayList<String> reshuffleRecurs(ArrayList<Character> charList){
		ArrayList<String> strListResult = new ArrayList<String>();
		if (charList.size() == 1){
			// transform the char as an list of string
			String lastChar = charList.toString();
			strListResult.add(lastChar);
			return strListResult;
		}else{
			char x = (char)charList.get(0);
			charList.remove(0);
			strListResult = reshuffleRecurs(charList);
			for (int i=0;i<strListResult.size();i++){
				//make 2 loops : 1 to add the element vertically , 1 to add the element horizontally
				
				//charList.add(i,x); 
				//strListResult.add(i,x);
				
			}
			return strListResult;
		}
		
		//return charList;
	}
	
	public void launcher(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a name: ");
		String myString = sc.next();	//System.console().readLine(); // Can not use this line in Eclipse, instead use scanner.
		//this.reshuffle(myString);
		ArrayList<Character> charList = new ArrayList<Character>();
		char[] charArray = myString.toCharArray();
		for(char c : charArray){
			charList.add(c);
		}
		ArrayList<String> charListFinal = new ArrayList<String>();
		charListFinal = this.reshuffleRecurs(charList);
		
		for (int i = 0; i<charListFinal.size(); i++){
			System.out.println(charListFinal.get(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		a.launcher();
	}

}
