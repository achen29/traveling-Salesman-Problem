import java.util.ArrayList;
public class BruteForce{
    public ArrayList<City> PermSolver(ArrayList<City> a, int b){
	ArrayList<City> combolist = a;
	ArrayList<City> Routeorder = new ArrayList<City>();
	int keeper = b;
	Routeorder.add(combolist.get(0));
	combolist.remove(0);
	for(int i = combolist.size() - 1; i > 0; i --){
	    Routeorder.add(combolist.get(keeper/factorial(i)));
	    keeper = keeper - (keeper/factorial(i)) * factorial(i);
	}
	Routeorder.add(combolist.get(0));
	Routeorder.add(a.get(0));
	return Routeorder;
    }
    public double DistSolver(ArrayList<City> c){
	double dist = 0;
	for (int i = 1; i < c.size(); i ++){
	    dist = c.get(i).Distance(c.get(i - 1));
	}
	dist = c.get(c.size()-1).Distance(c.get(0));
	return dist;
    }
    public int factorial(int number){
	int fact = number;
	    for(int i = number; i > 0; i--){
		number = number * i;
	    }
	    return fact;
    }
    public ArrayList<ArrayList<City>> Solution(ArrayList<City> c){
	int size = c.size() - 1;
	ArrayList<ArrayList<City>> routelist = new ArrayList<ArrayList<City>>();
	double current = 0;
	for(int i = 0; i < size; i ++){
	    double compare = DistSolver(PermSolver(c,i));
	    if (compare > current) {
		routelist.clear();
		routelist.add(PermSolver(c,i));
		current = compare;
	    }
	    else if(compare ==current){
		routelist.add(PermSolver(c,i));
	    }
	}
	return routelist;
    }
}
