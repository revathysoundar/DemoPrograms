package enumExample;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String genderString = "MALE";
		
		Gender gender = Gender.valueOf(genderString);
		System.out.println(gender);
		
		String otherString = gender.toString();
		System.out.println(otherString);
		
		WalkSignalSymbol signal = WalkSignalSymbol.DONT_WALK;
		
		System.out.println(signal);
		System.out.println(signal.isShouldProceed());		
		
		
		
		
	}

}
