package selftuts;

// Djikstras Algorithm
// graph has been taken form here  https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

class Selftuts{
    public static void main(String[] args){
    	
    	Graph g = new Graph();
    	g.dijkstras(0);

    }


}
class Graph {

	int[][] graph = {
						{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
						{4, 0, 8, 0, 0, 0, 0, 11, 0}, 
						{0, 8, 0, 7, 0, 4, 0, 0, 2}, 
						{0, 0, 7, 0, 9, 14, 0, 0, 0}, 
						{0, 0, 0, 9, 0, 10, 0, 0, 0}, 
						{0, 0, 4, 14, 10, 0, 2, 0, 0}, 
						{0, 0, 0, 0, 0, 2, 0, 1, 6}, 
						{8, 11, 0, 0, 0, 0, 1, 0, 7}, 
						{0, 0, 2, 0, 0, 0, 6, 7, 0} 
           }; 

	public void dijkstras(int currentNode) {
        
		
		int[][] graph = this.graph;
		
		int totalNodesInGraph = graph.length;
		// we need a pathlength array and initialize it with infinity
		int[] pathLength = new int[totalNodesInGraph];
		for(int i=0;i<totalNodesInGraph;i++) {
			// infinity is denoted by the max value Integer can store
			pathLength[i] = Integer.MAX_VALUE;
		}

		// we need a predessor array and initalize it with nil 
		int[] predecessor = new int[totalNodesInGraph];
		for(int i=0;i<totalNodesInGraph;i++) {
			// nil value is denoted by -1
			predecessor[i] = -1;
		}
		// we need a status array and initaialize all with temporary status 
		int[] status = new int[totalNodesInGraph];
		for(int i=0;i<totalNodesInGraph;i++) {
			// temporary status is denoted by 0 and permanent is denoted by -1
			status[i] = 0;
		}
		
		
		// make the pathLength of currentNode as zero and status as permanent
		pathLength[currentNode] = 0;
		
		DjikstraUtil(pathLength, status, predecessor);
		
		
		for(int i=0;i<totalNodesInGraph;i++) {
			System.out.println(i+"--"+pathLength[i]+"--"+predecessor[i]+"--"+status[i]);
		}
		
		
		
		
		
	}
	public void DjikstraUtil(int[] pathLength,int[] status,int[] predecessor) {
		
		// find the node whose status is temporary and pathLength is minimum. 
		// lets call that node as mininumPathLenghtNode
		int minimumPathLengthNode = findMininumPathLengthTemporaryNode(pathLength, status);
		// if no such node exists then exit recursion
		if(minimumPathLengthNode == -1) {
			return;
		}
		// make the status of minimumPathLengthNode as permanent
		status[minimumPathLengthNode] = 1;
		
		// find all the connected nodes to mininumPathLenghtNode
		int totalNodes = pathLength.length;
		for(int i=0;i<totalNodes;i++) {
			// check if value of cell in matrix is greater that zero which means it is an edge
			if(this.graph[minimumPathLengthNode][i]>0) {
				int eachConnectedNode = i;
				int weight = this.graph[minimumPathLengthNode][i];
				int data = pathLength[minimumPathLengthNode] + weight;
				int pathLenghtOfConnectedNode = pathLength[eachConnectedNode];
				
				// now checking the condition
				// pathLength(minimumPathLengthNode) + weight of edge from minimumPathLengthNode to connected node
				if(data<pathLenghtOfConnectedNode) {
					// update the path length
					pathLength[eachConnectedNode] = data;
					// update the predessor
					predecessor[eachConnectedNode] = minimumPathLengthNode;
				}else {
					
				}
			}
		}
		DjikstraUtil(pathLength, status, predecessor);
		
	}
	public int findMininumPathLengthTemporaryNode(int[] pathLength,int[] status) {
		// In status array 0 means temporary and 1 means permanent
		int minPathLength = Integer.MAX_VALUE;
		int minimumPathLengthNode = -1;
		int totalNodes = pathLength.length;
		for(int i=0;i<totalNodes;i++) {
			if(pathLength[i]<minPathLength && status[i]==0) {
				minPathLength = pathLength[i];
				minimumPathLengthNode = i;
			}
		}
		return minimumPathLengthNode;
	}
	
}










