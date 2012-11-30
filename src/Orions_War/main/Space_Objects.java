package Orions_War.main;

public class Space_Objects 
{
   static int playfieldHeight;
   static int playfieldWidth;
   public double xPosition, yPosition, xVelocity, yVelocity, radius;
   
   Space_Objects(double xPos, double yPos, double xVel, double yVel, double radius)
   {
	   xPosition = xPos;
	   yPosition = yPos;
	   xVelocity = xVel;
	   yVelocity = yVel;
	   this.radius = radius;
   }
   
   public double getRadius()
	{
		return radius;
	}
	
	public double getXPosition()
	{
		return xPosition;
	}
	
	public double getYPosition()
	{
		return yPosition;
	}
	
	public void move()
	{
		xPosition += xVelocity;
		yPosition += yVelocity;
	}

}
