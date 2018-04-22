/*
* pair3 class describe the edge weight from u to v
*/


public class pair3{

      public int weight;
      public int u;
      public int v;

      //constructor that creates an object which decribes the edge between two vertices
      public pair3(int weight, int u, int v){
          this.u = u;
          this.v = v;
          this.weight = weight;
      }

      public String toString(){
          return ""+ this.weight;
      }

}
