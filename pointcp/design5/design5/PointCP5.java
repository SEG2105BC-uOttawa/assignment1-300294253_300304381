package design5;

public abstract class PointCP5 {

    protected double xOrRho;
    protected double yOrTheta;
  
    public PointCP5(char c, double x, double y) {
      this.xOrRho = x;
      this.yOrTheta = y;
    }
  
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract double getDistance(PointCP5 point);
    public abstract PointCP5 rotatePoint(double rotation);
    public abstract String toString();
}