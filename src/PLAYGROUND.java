import java.util.*;

public class PLAYGROUND {

    public static Optional<List<List<Integer>>> method(int[] hands, int groupSize){

        List<List<Integer>> ans = new ArrayList<>();
        if (hands.length%groupSize != 0) return Optional.empty();
        Map<Integer,Integer> map = new HashMap<>();
        for (int ele:hands){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.addAll(map.keySet());

        while (!minHeap.isEmpty()){

            int cardNumber = minHeap.peek();

            List<Integer> currList = new ArrayList<>();

            for (int i=0;i<groupSize;i++){
                int currentCard = cardNumber+i;
                currList.add(currentCard);

                if (map.getOrDefault(currentCard,0) == 0 ){
                    return Optional.empty();
                }

               map.put(currentCard,map.get(currentCard)-1);
                if (map.get(currentCard) == 0){
                    if (minHeap.peek() == currentCard){
                       minHeap.poll();
                    }else {
                        return Optional.empty();
                    }
                }
            }
            ans.add(currList);
        }
        return Optional.of(ans);

    }

     class Twitter{
         int time;
         class Tweet{
            int tweetId;
            int timeStamp;

            public Tweet(int tweetId, int timeStamp){
                this.tweetId=tweetId;
                this.timeStamp=timeStamp;
            }
            public Tweet(){}
        }

        Map<Integer,HashSet<Integer>> followersList = new HashMap<>();
        Map<Integer,List<Tweet>> tweetList = new HashMap<>();

        public  void postTweet(int userId, int tweetId){
            time++;
            Tweet newTweet = new Tweet(tweetId, time);
            tweetList.computeIfAbsent(userId,k-> new ArrayList<>()).add(newTweet);
        }

        public List<Tweet> getNewsFeed(int userId){
            List<Tweet> ans = new ArrayList<>();
            PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a,b) -> a.timeStamp-b.timeStamp);
            if (tweetList.get(userId) != null){
                maxHeap.addAll(tweetList.get(userId));
            }

            HashSet<Integer> followeeList = followersList.get(userId);

            for (int followee:followeeList){
                maxHeap.addAll(tweetList.get(followee));
            }

            int size = 0;
            while(!maxHeap.isEmpty() && size<10){
                ans.add(maxHeap.poll());
                size++;
            }
            return ans;
        }

        public void follow(int followeeId, int followerId){
          if (followerId == followeeId) return;
          followersList.computeIfAbsent(followeeId,k-> new HashSet<>()).add(followerId);
        }

        public void unfollow(int followeeId, int followerId){
            if (followerId == followeeId) return;
            HashSet<Integer> followerList = followersList.get(followeeId);
            if (followerList!=null){
                followerList.remove(followerId);
            }


        }
    }
    public static void main(String[] args) {
        int[] input = {20,8,22,4,12,10,14};

    }
}
