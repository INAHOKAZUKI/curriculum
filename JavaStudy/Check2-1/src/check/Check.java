package check;
import constants.Constants;
public class Check {
	private static String firstName = "Inaho";
	private static String lastName = "Kazuki";
	
	public static void printName(String name1,String name2) {
		
		Check.firstName = name1;
		Check.lastName = name2;
		System.out.println("printNameメソッド" + "→" + name1 + name2);
		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//課題１行目
		printName(firstName,lastName);
		
		//課題２-３行目(Pet)
		
		String hoge = Constants.CHECK_CLASS_HOGE;
		String javaKichi = Constants.CHECK_CLASS_JAVA;
		Pet pet = new Pet(javaKichi, hoge);
		
		pet.introduce();
		
		//課題３行目(RobotPet)
		String r2d2 = Constants.CHECK_CLASS_R2D2;
		String luke = Constants.CHECK_CLASS_LUKE;
		RobotPet robotPet = new RobotPet(r2d2, luke);
		robotPet.introduce();
		
		
		
		
	}

}
