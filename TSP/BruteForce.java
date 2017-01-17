import java.util.ArrayList;
public class BruteForce{
    public ArrayList<City> PermSolver(ArrayList<City> a, int b){
	ArrayList<City> combolist = new ArrayList<City>();
	ArrayList<City> Routeorder = new ArrayList<City>();
	CopyList(combolist, a);
	int keeper = b;
	Routeorder.add(combolist.get(0));
	combolist.remove(0);
	for(int i = combolist.size() - 1; i > 0; i --){
	    Routeorder.add(combolist.get(keeper/factorial(i)));
	    combolist.remove(keeper/factorial(i));
	    keeper = keeper%factorial(i);
	}
	Routeorder.add(combolist.get(0));
	Routeorder.add(a.get(0));
	return Routeorder;
    }
    public double DistSolver(ArrayList<City> c){
	double dist = 0;
	for (int i = 1; i < c.size(); i ++){
	    dist = c.get(i).Distance(c.get(i - 1))+ dist;
	}
	dist = dist + c.get(c.size()-1).Distance(c.get(0));
	return dist;
    }
    public void CopyList(ArrayList<City> n, ArrayList<City> m){
	n.clear();
	for (int i = 0; i < m.size(); i ++){
	    n.add(m.get(i));
	}
    }
    public int factorial(int number){
	int fact = 1;
	    for(int i = number; i > 0; i--){
		fact = fact * i;
	    }
	    return fact;
    }
    public ArrayList<ArrayList<City>> Solution(ArrayList<City> c){
	int size = c.size() - 1;
	ArrayList<ArrayList<City>> routelist = new ArrayList<ArrayList<City>>();
	double current = DistSolver(c);
	for(int i = 0; i < factorial(size)/2; i ++){
	    double compare = DistSolver(PermSolver(c,i));
	    if (compare < current) {
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
