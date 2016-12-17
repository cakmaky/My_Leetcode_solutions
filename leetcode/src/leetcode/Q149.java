package leetcode;
/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
import java.util.*;
public class Q149 {
	
	public static Double findslope(Point a, Point b){
		if(a.x == b.x && a.y == b.y){
			return Double.MIN_VALUE;
		}
		else if(a.x == b.x){
			return Double.MAX_VALUE;
		} 
		else if(a.y == b.y){
			return 0.0;
		}
		else {
			return (b.y - a.y + 0.0) / (b.x - a.x);
		}	
	}
	public static int maxPoints(Point[] points) {
		if(points.length == 0){
			return 0;
		}
		int max = 0;
		int equal = 0;
		HashMap<Double, Integer> map = new HashMap<>();
		for(int i=0; i<points.length; i++){
			map.clear();
			equal = 0;
			for(int j=0; j<points.length; j++){
				if(i != j){
					Double m = findslope(points[i], points[j]);
					if(m.equals(Double.MIN_VALUE)){
						equal++;
					}
					else if(map.containsKey(m)){
						map.put(m, (map.get(m) +1));
					} else {
					map.put(m, 1);
					}	
				}
			}
			Set<Double> set = map.keySet();
			
			if(set.isEmpty()){
				if(equal > max){
					max = equal;
				}
			}
			for(Double k : set){
				if((map.get(k) + equal) > max){
					max = (map.get(k) + equal);
				}	
			}
			set.clear();	
		}
		return (max + 1);	
    }

	public static void main(String[] args) {
		
		
		
		Point[] points = new Point[2];
		points[0] = new Point(0,0);
		points[1] = new Point(0,0);
		//points[2] = new Point(2,2);
		//points[3] = new Point(2,2);
	//	points[4] = new Point(5,5);
		//points[5] = new Point(1,3);
		
		System.out.println(maxPoints(points));

	}

}
class Point {
	      int x;
	      int y;
	      Point() { x = 0; y = 0; }
	      Point(int a, int b) { x = a; y = b; }
	  }