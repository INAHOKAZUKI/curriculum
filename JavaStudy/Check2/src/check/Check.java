package check;
import constants.Constants;
public class Check {

	

	private static String firstName = "Inaho";
	private static String lastName = "Kazuki";
	private void fullName(String firstName,String lastName) {
		System.out.println(firstName + lastName);
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(firstName);
		System.out.println(lastName);
//			private void fullName(String firstName,String lastName) {
//			System.out.println(firstName + lastName);
//		}
		 Check check = new Check();
		
		check.fullName(firstName,lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		
		pet.introduce();
		
		RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants. CHECK_CLASS_LUKE);
		robo.introduce();
		 
		
		

	}

}
