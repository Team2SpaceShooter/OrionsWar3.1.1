package Orions_War.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.net.URL;

public class BufferedImageLoader
{
  public BufferedImage loadImage(String Path_To_SpriteSheet) throws IOException
  {
	  BufferedImage img = ImageIO.read(new File(Path_To_SpriteSheet));
	  return img;
  }
	
	
	
}
