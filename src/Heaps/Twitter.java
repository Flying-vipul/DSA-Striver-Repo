import java.util.*;

int time =0;
public class Twitter {


    public Twitter() {
    }

    class Tweet{
        int tweetId;
        int timestamp;

        public Tweet(int tweetId,int timestamp){
            this.tweetId=tweetId;
            this.timestamp=timestamp;
        }

    }

    Map<Integer, HashSet<Integer>> followersList = new HashMap<>();
    Map<Integer,List<Tweet>> tweetsList = new HashMap<>();

    public void postTweet(int userId, int tweetId) {
        time++;

        Tweet newTweet = new Tweet(tweetId,time);

        if (tweetsList.containsKey(userId)){
            List<Tweet> existingTweetList = tweetsList.get(userId);
            existingTweetList.add(newTweet);
        }else {
            List<Tweet> newList = new ArrayList<>();
            newList.add(newTweet);
            tweetsList.put(userId,newList);
        }

    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans = new ArrayList<>();

        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.timestamp - a.timestamp);
        List<Tweet> myTweets = tweetsList.get(userId);
        if (myTweets!=null){
            maxHeap.addAll(myTweets);
        }
        HashSet<Integer> toFollowList = followersList.get(userId);
        if (toFollowList!=null){
            for (int follweId:toFollowList){
            List<Tweet> followeeList = tweetsList.get(follweId);
                maxHeap.addAll(followeeList);
            }
        }
        int size =0;
        while(!maxHeap.isEmpty() && size<10){
            ans.add(maxHeap.poll().tweetId);
            size++;
        }
        return ans;
    }

    public void follow(int followerId, int followeeId) {

       followersList.putIfAbsent(followerId,new HashSet<>());
       HashSet<Integer> getHashset =  followersList.get(followerId);
       getHashset.add(followeeId);

    }

    public void unfollow(int followerId, int followeeId) {
        HashSet<Integer> getHashSet = followersList.get(followerId);
        if (getHashSet!=null){
            getHashSet.remove(followeeId);
        }
    }

}

void main() {
}
