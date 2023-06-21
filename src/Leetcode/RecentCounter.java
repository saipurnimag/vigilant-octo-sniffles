package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        if(queue.isEmpty()){
            queue.add(t);
        }else{
            queue.add(t);
            while((t-queue.peek())>3000){
                queue.poll();
            }
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */