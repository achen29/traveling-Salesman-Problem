import java.util.Random;

public class BruteForce {
private City start;
private int[] path;
private double distance;

public BruteForce(Route r){
	Random rand = new Random();
	int randomCity = rand.nextInt((r.amount) -1);
	System.out.println("Random City = " + randomCity);
	start = r.getRoute()[randomCity];
	System.out.println("StartCity Position: " + start.getX() + "," + start.getY());
}

public void bruteForce(Route r){
	int nodes = r.amount; //number of cities in a route
	double tempDist; //records the distance of a route
	double Shortest = 0; 
	City cities[] = r.getRoute();
	City tempPath[] = new City[nodes];
	City ShortestRoute[] = new City[nodes];
	int positionStart = findPosition(r, start);
	
	City temp = cities[0];
	cities[0] = cities[positionStart];
	cities[positionStart] = temp;
	
	int[]clone = new int[nodes];
	for(int i = 0 ; i < nodes ; i++){
		clone[i] = i; //makes a clone of route names cities based on position in array
	
	}
	
	do{
	tempDist = 0;
	for(int i = 0 ; i <nodes ; i ++){
		tempPath[i] = cities[clone[i]];
		if (i != 0){
			tempDist += Distance(cities[clone[i]], cities[clone[i-1]]);
			//add the distance between the cities in the route
		}
	}
	//add the distance from the last city back to the first city
	tempDist += Distance(cities[clone[nodes-1]] , cities[0]);
	System.out.println("Temporary Dist: " + tempDist);
	if(Shortest > tempDist || Shortest == 0){
		Shortest = tempDist;
		for(int i = 0 ; i < nodes ; i++){
			ShortestRoute[i] = tempPath[i];
		}
	}
	System.out.println("Current Shortest Distance: " + Shortest);
	}
while((clone = Permutations.nextP(clone)) != null);

//build a path witht the positions with the cities
	int[] finalpath = new int[nodes +1];
	for(int i = 0 ; i <nodes ; i++){
		finalpath[i] = findPosition(r , ShortestRoute[i]);
		if(finalpath[i] == 0){
			finalpath[i] = positionStart;
		}
		else{
			if(finalpath[i] == positionStart){
				finalpath[i] = 0;
			}
		}
		finalpath[nodes] = positionStart;
		setRoute(finalpath);
		setDistance(Shortest);
		System.out.println(" ");
		System.out.print(" cheapest cost : ");
		System.out.println(Shortest);
		System.out.print(" cheapest path : ");
		for (int j = 0; j <nodes; j++) {
			
			System.out.print("-"+ShortestRoute[j].getX());
			
			
		}
		System.out.println();
		City z=cities[positionStart];
		cities[positionStart]=cities[0];
		cities[0]=z;
	}
	
}
public void DisplayPath(){
	for(int i = 0 ; i <getPath().length - 1 ; i++){
		System.out.println(getPath()[i]);
	}
}
public int[] getPath(){
	return path;
}
public void DisplayDistance(){
	System.out.println("Total Distance = " + getDistance());
}
private double getDistance() {
	return distance;
}

private void setDistance(double d) {
	this.distance =d;
	
}

private void setRoute(int[] p) {
	this.path = p;
	
}

private int findPosition(Route r, City start) {
 Boolean x = true;
 int position = 0;
 
 while(x && position < r.getRoute().length){
	 if(start.getX() == r.getRoute()[position].getX() && start.getY() == r.getRoute()[position].getX()){
		 x = false;
	 }
	 else position++;
 }
 return position;
}

public double Distance(City c1, City c2){
	double deltaX = c1.getX() - c2.getX();
	double deltaY = c1.getY() - c2.getY();
	double distance  = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	return distance;
}
}
