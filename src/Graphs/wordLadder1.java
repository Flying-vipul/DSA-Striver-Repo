package Graphs;

import java.util.*;

public class wordLadder1 {

    class Pair {

        String word;
        int level;

        public Pair(String word, int level) {
            this.word = word;
            this.level = level;
        }
    }


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int len = beginWord.length();
        Set<String> set = new HashSet<>(wordList);

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord, 1));

        while (!q.isEmpty()) {

            Pair currPair = q.poll();
            String currWord = currPair.word;
            int currLevel = currPair.level;

            if (Objects.equals(endWord, currWord)) return currLevel;

            for (int i = 0; i < len; i++) {

                char[] arr = currWord.toCharArray();

                for (char j = 'a'; j <= 'z'; j++) {
                    arr[i] = j;
                    String newWord = new String(arr);

                    if (set.contains(newWord)){
                        set.remove(newWord);
                        q.offer(new Pair(newWord,currLevel+1));
                    }
                }
            }

        }
        return 0;


    }

}
