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
	List.add(AK);
	List.add(TX);
	BruteForce brute = new BruteForce();
	System.out.print(brute.Solution(List));
	
    }
}
