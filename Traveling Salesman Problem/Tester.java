
public class Tester {
public static void main(String[] args){
	Route t = new Route();
	BruteForce bf = new BruteForce(t);
	bf.bruteForce(t);
	bf.DisplayPath();
	bf.DisplayDistance();
}
}
