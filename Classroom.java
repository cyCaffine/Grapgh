import java.util.*;

public class Classroom{
    static class Edge{
        int src;
        int desti;
    
    public Edge(int s, int d){
        this.src = s;
        this.desti = d;
    }
    }
       public static void CreatedGrapgh(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
           graph[i] = new ArrayList<Edge>();
       }
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
        
        
        
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreatedGrapgh(graph);

        for(int i =0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.desti+" ");
        }
        
    }
}