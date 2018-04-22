import java.util.*;

public class kruskal{

  //Disjoint Sets Data Structure
  int fathers[] = new int[100];

  public int find(int x){
      if(fathers[x] == x){
          return x;
      }
      return find(fathers[x]);
  }


  public void unite(int x , int y){
      int fx = find(x);
      int fy = find(y);
      fathers[fx] = fy;
  }


  public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);
      kruskal samp = new kruskal();
      //intitialize fathers for the disjoint Sets
      for(int i =0; i< 100; i++){
          samp.fathers[i] = i;
      }
      //declaring variable to load input
      int n, m;
      int u,v,weight;
      ArrayList<pair3> edges = new ArrayList<pair3>();
      //loading the input
      n = stdin.nextInt();
      m = stdin.nextInt();
      for(int i = 0; i < m; i++){
          u = stdin.nextInt();
          v = stdin.nextInt();
          weight = stdin.nextInt();
          edges.add(new pair3(weight,u, v));
      }
      // we print a line to separe input from output
      System.out.println();
      //now  THE KRUSKAL'S ALGORITHM BEGINS
      // we firstly declare all the variables needed for MST
      int mst_weight = 0;
      int mst_edges = 0;
      int mst_ni = 0;
      // STEP 1: sort the list of mst_edges
      // comparator is interface that sort uses
      Collections.sort(edges, new Comparator<pair3>(){
          @Override
          public int compare(pair3 p1, pair3 p2){
            return p1.weight - p2.weight;
          }
      });
      //Step 2-3:
      while((mst_edges < n-1) || (mst_ni < m)){
        u = edges.get(mst_ni).u;
        v = edges.get(mst_ni).v;
        weight = edges.get(mst_ni).weight;
        // we check if the edge is ok to be included in the MST
        // if u and v are in different trees (if they are on the same we will create a)
        if(samp.find(u) != samp.find(v)) {
          // we united the two trees the edges connect
          samp.unite(u,v);
          // we add the weight of the edges
          mst_weight += weight;
          // we print the edge and count it
          System.out.println(u + " " + v + " " + " " + weight);

        }
        // Presenting the weight
        System.out.println("Weight fo the MST is "+ mst_weight);
      }














  }





}
