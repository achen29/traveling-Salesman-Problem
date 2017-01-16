import java.util.ArrayList;
public class Route{
    public ArrayList<City> rt = new ArrayList<City>();
    public Route(ArrayList<City> r){
	rt = r;
    }
    public ArrayList<City> getRoute(){
	return rt;
    }
    public void add(City a){
	rt.add(a);
    }
    public String toStringR(){
	String list = "";
	for(int i = 0; i < rt.size()-1;i++){
	    list = list + rt.get(i).toString() + ",";
	}
	list = rt.get(rt.size() - 1).toString();
	return list;
    }
}
