package Graphs;

import java.util.*;

public class DSUHard {



    public List<List<String>> method(List<List<String>> accounts){

        int n = accounts.size();

        int[] parent = new int[n];
        int[] rank = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = i;
        }

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String email = accounts.get(i).get(j);

                if(!map.containsKey(email)){
                    map.put(email,i);
                }else{
                    union(parent,rank,map.get(email),i);
                }
            }
        }

        List<String>[] mergeMails = new ArrayList[n];

        for(int i=0;i<n;i++){
            mergeMails[i] = new ArrayList<>();
        }

            for(String email: map.keySet()){
                int rootIndex = find(map.get(email),parent);
                mergeMails[rootIndex].add(email);
            }

        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mergeMails[i].isEmpty()) continue;

            Collections.sort(mergeMails[i]);

            String name = accounts.get(i).get(0);
            mergeMails[i].addFirst(name);
            ans.add(mergeMails[i]);
            
        }
        return ans;
    }

    private void union(int[] parent, int[] rank, int u, int v){

        int currU = find(u, parent);
        int currV = find(v,parent);

        if(currV!=currU){

            if(rank[currU]<rank[currV]){
                parent[currU] = currV;
            } else if (rank[currU]>rank[currV]) {
                parent[currV] = currU;
            }else {
                parent[currU] = currV;
                rank[currV]++;
            }
        }
    }

    private int find(int node ,int[] parent){
        if(node == parent[node]){
            return node;
        }
        return parent[node] = find(parent[node],parent);
    }
}
