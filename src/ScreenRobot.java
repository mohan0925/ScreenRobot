/**ScreenRobot class is designed to move the robot from a particular position to origin
 * Directions are given by using the U,D,L,R words based on these values robot is moved
 * When the robot reaches the origin then the program execution is stopped. 
 */
public class ScreenRobot {
	//variables for storing the values
	private int Move_up; 
	private int Move_down;
	private int Move_left;
	private int Move_right;
	private int x,y; // x,y positions values

	/**Default constructor
	 * This sets Move_up,Move_down,Move_left,Move_right to 0
	 */
	public ScreenRobot() 
	{
		this.Move_up = 0;
		this.Move_down = 0; 
		this.Move_left = 0; 
		this.Move_right = 0; 
	}
	/**sets x and y values
	 * 
	 * @param x this value is used to set the x axis position
	 * @param y this value is used to set the y axis position
	 */
	public void set_position(int x,int y)
	{
			this.x=x;
			this.y=y;
			this.Move_up=y;
			this.Move_down=0;
			this.Move_left = 0; 
			this.Move_right = x; 
		
	}
	/**Parameter is passed to direct the robot from current position 
	 * It direct the robot based on the direction given
	 * U,D,L,R are the direction for the robot which is passed through the argument
	 * Based on the argument the robot takes it's position by incrementing the specific variable assigned
	 * 
	 * @param move parameter is a string to direct the robot
	 */
	public void set_finalPosition(String move) 
	{
		if(move.equalsIgnoreCase("u"))
		{
			Move_up++;
		}
		else if(move.equalsIgnoreCase("d"))
		{
			Move_down++;
		}
		else if(move.equalsIgnoreCase("l"))
		{
			Move_left++;
		}
		else if(move.equalsIgnoreCase("r"))
		{
			Move_right++;
		}	
	}
	/**Returns the x position
	 * 
	 * @return x it returns the current x position of robot
	 */
	public int get_X_position()
	{
		x=(Move_right - Move_left);
		return x;
	}
	/**Returns the y position
	 * 
	 * @return y it returns the current y position of robot
	 */
	public int get_Y_position()
	{
		y=(Move_up - Move_down);
		return y;
	}
}
