// import scanner class
import java.util.Scanner;

public class ScreenRobotTest {

	private static Scanner sc; // Variable for the scanner is initialised

	public static void main(String[] args) 
	{	
		int x=0,y=0; // variable to store x,y values
		String start="yes";
		sc = new Scanner(System.in);	
		// creating the instance for ScreenRobot class
		ScreenRobot Robot_instance_object= new ScreenRobot();
		System.out.println("Robot home position is origin(0,0)"); 
		System.out.println(); 
		// User enters the X and  Y positions
		System.out.println("Enter the start point of robot	:");
		System.out.println("Enter x position	:");
		x=sc.nextInt();
		System.out.println("Enter y position	:");
		y=sc.nextInt();
		System.out.println("Robot is at position ("+x+","+y+")"); 
		sc.nextLine();	
		Robot_instance_object.set_position(x, y);
		System.out.println("Do you want to take robot to origin?(yes or no)");
		String move =sc.nextLine();	
		if(move.equals("yes"))
		{
			System.out.println("Enter moves to direct the Robot	to origin"); 
			/*Until the robot reaches the origin, loop repeats itself */
			while(!start.equals("no"))
			{			
				System.out.println("Press U-up,D-down,L-left,R-right");
				String direction=sc.nextLine();
				Robot_instance_object.set_finalPosition(direction);
				x=Robot_instance_object.get_X_position();
				y=Robot_instance_object.get_Y_position();
				
				System.out.println("Final Position  (X,Y) = ("+x+","+y+")");
				
				/* When condition is true
				 * It displays the robot final position
				 * Internal validations is done here
				 * */
				if(x==0 && y==0)
				{
					start="no";
					System.out.println("-------------Robot reached the origin (0,0) ----------------");
				}
			}
		}
		else if(move.equals("no"))
		{
			x=Robot_instance_object.get_X_position();
			y=Robot_instance_object.get_Y_position();
			System.out.println("Final Position (X,Y) = ("+x+","+y+")");
		}
	}
}
