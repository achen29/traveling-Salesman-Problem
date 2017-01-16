import java.util.Random;
public class City{
    private double XPOS,YPOS;
    private String name;
    public City(String n,double x,double y){
	XPOS = x;
	YPOS = y;
	name = n;
    }
    public double getX(){
	return XPOS;
    }
    public double getY(){
	return YPOS;
    }
    public void setX(int xi){
	XPOS = xi;
    }
    public void setY(int yi){
	YPOS = yi;
    }
    public double Distance(City other){
	double deltaX = other.XPOS - this.XPOS;
	double deltaY = other.YPOS - this.YPOS;
	double distance  = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	return distance;
    }
}
	
