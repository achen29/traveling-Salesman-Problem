
public class Route {
public int amount = 3;
private City route[] = new City[amount];

public Route(){
	for(int i = 0 ;  i < getRoute().length ; i ++){
		getRoute()[i] = new City();
	}
}
public City[] getRoute(){
	return route;
}
public void setRoute(City r[]){
	this.route = r;
}

}
