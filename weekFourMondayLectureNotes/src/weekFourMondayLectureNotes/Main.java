package weekFourMondayLectureNotes;

public class Main {
	
	public static void main(String[] args) throws UnderAgeException{
		
		Main m1 = new Main();
		
		m1.validateAge(21);
		
	}
	
	public void validateAge(int age) throws UnderAgeException {
		
		if(age < 21) {
			
			throw new UnderAgeException();
			
		}
		
	}
	
}
