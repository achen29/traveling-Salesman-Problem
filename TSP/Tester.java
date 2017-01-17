import java.util.ArrayList;
public class Tester{
    public static void main(String[] args){
	City NY = new City("New York", 1, 1);
	City CA = new City("Cali", 1, 0);
	City AK = new City("Alaska", 0, 1);
	City TX = new City("Texas", 0,0);
	ArrayList<City> List = new ArrayList<City>();
	List.add(NY);
	List.add(CA);
	List.add(TX);
	List.add(AK);
	BruteForce brute = new BruteForce();
	System.out.println(brute.factorial(5));
	System.out.println(NY.Distance(CA));
	System.out.println(CA.Distance(TX));
	System.out.println(brute.DistSolver(List));
	System.out.println(brute.PermSolver(List,0));
	System.out.println(brute.PermSolver(List,1));
	System.out.println(brute.PermSolver(List,2));
	System.out.println(brute.DistSolver(brute.PermSolver(List,0)));
	System.out.println(brute.Solution(List));
    }
}
