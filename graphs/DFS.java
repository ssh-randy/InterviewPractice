package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DFS {
	
	
	
	public static void main(String[] args){
	
		ArrayList<HashMap<Integer, Integer>> adjacencies = new ArrayList<HashMap<Integer,Integer>>();
		
		//each edge contains a vertex and weight
		HashMap<Integer, Integer> edge = new HashMap<Integer, Integer>();
		
		edge.put(1, 1);
		//0 -> 1
		adjacencies.add(0, edge);
		
		
		edge = new HashMap<Integer, Integer>();

		edge.put(0, 1);
		edge.put(2, 1);
		edge.put(3, 1);
		
		//1-> (0, 2, 3)
		adjacencies.add(1, edge);
		
		
		edge = new HashMap<Integer, Integer>();

		edge.put(1, 1);
		edge.put(5, 1);
		edge.put(7, 1);
		
		//2-> (1, 5, 7)
		adjacencies.add(2, edge);
		
		
		edge = new HashMap<Integer, Integer>();

		edge.put(1, 1);
		edge.put(4, 1);
		
		//3-> (1, 4)
		adjacencies.add(3, edge);
		
		
		edge = new HashMap<Integer, Integer>();

		edge.put(3, 1);
		edge.put(5, 1);
		
		//4-> (3, 5)
		adjacencies.add(4, edge);
		
		edge = new HashMap<Integer, Integer>();

		edge.put(2, 1);
		edge.put(4, 1);
		edge.put(6, 1);
		
		//5-> (2, 4, 6)
		adjacencies.add(5, edge);
		
		edge = new HashMap<Integer, Integer>();

		edge.put(5, 1);
		edge.put(7, 1);
		
		//6-> (5, 7)
		adjacencies.add(6, edge);
		
		edge = new HashMap<Integer, Integer>();

		edge.put(2, 1);
		edge.put(6, 1);
		
		//7-> (2, 6)
		adjacencies.add(7, edge);
		
		edge = new HashMap<Integer, Integer>();

		//8 -> ()
		adjacencies.add(8, edge);
		
		
		
		
		
		
	}
	
	
	public static int[][] DFS(ArrayList<HashMap<Integer, Integer>> graph, int startingVertex){
		
		int[][] dfsInfo = new int[graph.size()][2];
		
		//starting vertex has distance 0 from itself
		dfsInfo[startingVertex][0] = 0;
		
		Stack<Integer> vertices = new Stack<Integer>();
		
		vertices.push(startingVertex);
		
		while(!vertices.isEmpty()) {
			
			Integer vertex = vertices.pop();
			for(Map.Entry<Integer, Integer> node : graph.get(vertex).entrySet()) {
				
			}
			
			
		}
		
		return dfsInfo;
	}
	
	

}
