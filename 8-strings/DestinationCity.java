//https://leetcode.com/problems/destination-city/
import java.util.*;
public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();

        for(List<String> path : paths){
            cities.add(path.get(0)); // adding all the outgoing paths from cities
        }

        for(List<String> path : paths){
            String dest = path.get(1); // destination cities here
            if(!cities.contains(dest)){
                return dest; // if cities doesn't contain the destination city then it means, it's the final destination city
            }
        }
        return "";
    }
}
