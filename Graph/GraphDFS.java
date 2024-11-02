import java.util.*;
public class GraphDFS{
    private Map<Integer, List<Integer>> adjList;
    public GraphDFS(){
        this.adjList = new HashMap<>();
    }
    public void addEdge(int u,int v){
        adjList.computeIfAbsent(u, x->new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, x->new ArrayList<>()).add(u);
    }
    public void DFS(int startNode){
        Set<Integer> visited = new HashSet<>();
        System.out.println("DFS Travasel");
        DFSUtil(startNode, visited);
    }
    private void DFSUtil(int node,Set<Integer> visited){
        visited.add(node);
        System.out.print(node+" ");
        for(int neighbour:adjList.getOrDefault(visited, new ArrayList<>())){
            if(!visited.contains(neighbour)){
                DFSUtil(neighbour, visited);
            }
        }
    
    }
    public void printGraph(){
        for(Map.Entry<Integer,List<Integer>> entry:adjList.entrySet()){
            System.out.println("Node: "+entry.getKey()+"is connected to :"+entry.getValue());
        }
    }
    public static void main(String[] args) {
            GraphDFS graph = new GraphDFS();
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1,4);
            graph.addEdge(2, 5);
            graph.printGraph();
            graph.DFS(0);
    }
}