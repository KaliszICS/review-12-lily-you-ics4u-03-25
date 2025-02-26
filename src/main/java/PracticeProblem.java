public class PracticeProblem {

	public static void main(String args[]) {
		boolean q1 = isPalindrome("Racecar");
		System.out.println(q1);

	}

	public static boolean isPalindrome(String word){
		String result = word.replaceAll(" ", "");
		result = result.toLowerCase();
		for(int i = 0; i < result.length(); i++){
			if(result.charAt(i) != result.charAt((result.length() - 1 - i))){
				return false;
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String name){
		int index = -1;
		for(int i = 0; i < names.length; i++){
			if(names[i] == name){
				index = i;
			}
		}
		return ages[index];
	}

	public static int countWords(String sentence, char letter){
		String [] words = sentence.split(" ");
		int count = 0;
		boolean hasLetter = false;
		String word;
		for(int i = 0; i < words.length; i++){
			word = words[i];
			for(int x = 0; x < words[i].length(); x++){
				if(word.charAt(x) == letter){
					hasLetter = true;
				}
			}
			if(hasLetter){
				count++;
			}
		}
		return count;
	}

}
