package assessmentPart2;



public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count = 0;
		String phrase = "How many vowels in this string?";
		String lowerPhrase = phrase.toLowerCase();
		int i = 0; 
		int lenOfString = lowerPhrase.length(); 
			
		while(i < lenOfString)
		{
			char getCharacter = lowerPhrase.charAt(i);
			switch(getCharacter)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
			i++;
		}
		if(count != 0)
		{
			System.out.println("No. of Vowels present in the string: " + count);
		}
		else
		{
			System.out.println("No Vowels in the string");
		}
		
		
	}

}
