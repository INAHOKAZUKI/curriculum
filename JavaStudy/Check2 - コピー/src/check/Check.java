package check;
import constants.Constants;
public class Check {

	

	private static String firstName = "Inaho";
	private static String lastName = "Kazuki";

	public static void main(String[] args) {
		
		
		
		
//		private void fullName(String firstName,String lastName) {
//			System.out.println(firstName + lastName);
//		}
		 
		
		
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		
		pet.introduce();
		
		RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants. CHECK_CLASS_LUKE);
		robo.introduce();
		
		

	}

}
