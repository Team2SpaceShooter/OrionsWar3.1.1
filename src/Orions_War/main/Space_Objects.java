package Orions_War.main;

public class Space_Objects 
{
   static int playfieldHeight;
   static int playfieldWidth;
   double xPosition, yPosition, xVelocity, yVelocity, radius;
   
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
		//moves an object, if off screen wraps around.
		xPosition = xPosition + xVelocity;
		yPosition = yPosition + yVelocity;
		
		if(xPosition > 800)
			xPosition -= 800;
		if(yPosition > 600)
			yPosition -= 600;
		if(xPosition < 0)
			xPosition += 800;
		if(yPosition < 0)
			yPosition += 600;
	
	}

}
