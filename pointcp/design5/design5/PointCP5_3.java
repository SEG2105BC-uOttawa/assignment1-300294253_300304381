// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */

package design5;

public class PointCP5_3 extends PointCP5
{  
  private double x;
  private double y;
  public PointCP5_3(char c, double XorRho, double yOrTheta) {
    super(c, XorRho, yOrTheta);
  }
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getRho()
  {
    return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
  }
  
  public double getTheta()
  {
    return Math.toDegrees(Math.atan2(y, x));
  }
  public double getDistance(PointCP5 pointB)
  {
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }
  public PointCP5_3 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP5_3('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }
  public String toString()
  {
    return "Stored as Cartesian " + "\n" + "Cartesian  (" + getX() + ", " + getY() + ")"+"\n"+"Polar [" + getRho() + ", " + getTheta() + "]";
  }
}