package practice.datastructure.graphtrees;

import java.util.ArrayList;

public class BFSOfGraph {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        //5
        //[[1, 2, 3], [], [4], [], []]
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);

        for(int i=0; i< adj.size(); i++){
            if(!adj.get(i).isEmpty()){
                for (int j=0; j<adj.get(i).size(); j++){
                    integers.add(adj.get(i).get(j));
                }
            }

        }
        return integers;
    }
}
