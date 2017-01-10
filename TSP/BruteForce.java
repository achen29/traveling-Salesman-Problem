import java.util.ArrayList;
public class BruteForce{
    public double PermSolver(ArrayList<City> a, int b){
	ArrayList<City> combolist = a;
	int keeper = b;
	int[]matrix = new int[a.size()];
	for (int i = 0; i < combolist.size(); i ++){
	    matrix[i] = keeper/(combolist.size() - 1 - i);
	    keeper = keeper - (keeper/(combolist.size() - 1 - i) * (combolist.size() - 1 - i));
	}
        ArrayList<City> routeorder = new ArrayList<City>();
	for (int i = 0; i < a.size(); i ++){
	    routeorder.add(combolist.get(matrix[i]));
	    combolist.remove(matrix[i]);
	}
	return DistSolver(routeorder);
    }
    public double DistSolver(ArrayList<City> c){
	double dist = 0;
	for (int i = 1; i < c.size(); i ++){
	    dist = c.get(i).Distance(c.get(i - 1));
	}
	dist = c.get(c.size()-1).Distance(c.get(0));
	return dist;
    }
    public ArrayList<City>[] Solution(ArrayList<City> c){
	int factorial = 1;
	for (int i = c.size(); i > 0; i --){
	    factorial = factorial * i;
	}
	for (int i = 0; i < factorial; i ++){
	}
    }
}
