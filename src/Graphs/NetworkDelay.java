package Graphs;

import java.util.*;

public class NetworkDelay {

    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<int[]>> adjList = new ArrayList<>();

        for (int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] ele:times){
            adjList.get(ele[0]).add(new int[]{ele[1], ele[2]});
        }

        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k] = 0;

        // int of data type in which [how far can go , node];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        pq.offer(new int[]{0,k});
        while (!pq.isEmpty()){

            int[] current = pq.poll();
            int currDist = current[1];
            int currNode = current[2];

            if (currDist > distance[currNode]) continue;

            for (int[] neighbour : adjList.get(currNode)){
                int nextNode = neighbour[0];
                int weight = neighbour[1];

                // relaxation step
                if (distance[nextNode] > weight+currDist){
                    distance[nextNode] = weight+currDist;
                    pq.offer(new int[]{distance[nextNode],nextNode});
                }
            }
        }

        int time = 0;
        for (int i=1;i<=n;i++){
            if(distance[i] == Integer.MAX_VALUE){
                return -1;
            }
            time = Math.max(time, distance[i]);
        }

        return time;

    }
}
