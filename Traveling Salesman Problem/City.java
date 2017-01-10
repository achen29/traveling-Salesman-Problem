import java.util.Random;

public class City {
private double XPOS, YPOS;
public boolean visited = false;
public City(){
	Random rand = new Random();
	this.XPOS = rand.nextInt(500);
	this.YPOS = rand.nextInt(500);
}
public double getX(){
	return this.XPOS;
}
public void setX(double n){
	this.XPOS = n;
}
public double getY(){
	return this.YPOS;
}
public void setY(double n){
	this.YPOS = n;
}
public boolean isVisited(){
	return visited;
}
public void setVisited(boolean n){
	this.visited = n;
}

}

//so i have an xy position for every city
//i can find the distance between each city
//have a list of cities
//randomly pick 
