
import java.io.*; 
import java.util.Scanner;

public class ScreenRobotTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
//		String move = "UDDLLRUUUDUURUDDUULLDRRRR"; 
		System.out.println("Enter moves to direct the Robot	:"); 
		System.out.println("U-up,D-down,L-left,R-right	Write in sequence order"); 
		String move =sc.nextLine();
		ScreenRobot ScreenRobot_obj= new ScreenRobot();
	
		ScreenRobot_obj.finalPosition(move); 

	}

}
