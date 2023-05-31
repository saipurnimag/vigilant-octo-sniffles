package Leetcode75;

/**
 * 1396. Design Underground System
 * <p>
 * https://leetcode.com/problems/design-underground-system/
 */

import java.util.HashMap;
import java.util.HashSet;

class TrainEntry {
    String location;
    int time;

    TrainEntry(String location, int time) {
        this.location = location;
        this.time = time;
    }
}

class AverageEntry {
    int totalSum;
    int trips;

    AverageEntry(int totalSum, int trips) {
        this.totalSum = totalSum;
        this.trips = trips;
    }
}

class UndergroundSystem {

    HashMap<Integer, TrainEntry> entries;
    HashMap<String, AverageEntry> averages;

    public UndergroundSystem() {
        entries = new HashMap<>();
        averages = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        //Add an entry
        entries.put(id, new TrainEntry(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        //Remove the entry
        TrainEntry checkIn = entries.get(id);
        String combo = checkIn.location + "_" + stationName;
        if (averages.containsKey(combo)) {
            AverageEntry avg = averages.get(combo);
            averages.put(combo, new AverageEntry(avg.totalSum + (t - checkIn.time), avg.trips + 1));
        } else {
            averages.put(combo, new AverageEntry(t - checkIn.time, 1));
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String combo = startStation + "_" + endStation;
        AverageEntry entry = averages.get(combo);
        return entry.totalSum / (entry.trips * 1.0);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */