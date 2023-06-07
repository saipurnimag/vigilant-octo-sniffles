package Leetcode;

import java.util.*;

class Entry {
    int val, listNum;

    Entry(int val, int listNum) {
        this.val = val;
        this.listNum = listNum;
    }
}

public class SmallestRangeCoveringElementsFromKLists {
    public int[] smallestRange(List<List<Integer>> nums) {
        if (nums.size() == 1)
            return new int[]{1,1};
        List<Entry> list = new ArrayList<>();

        for (int i = 0; i < nums.size(); ++i) {
            for (int j = 0; j < nums.get(i).size(); ++j) {
                list.add(new Entry(nums.get(i).get(j), i));
            }
        }

        Collections.sort(list, (o1, o2) -> o1.val - o2.val);

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 1;
        int range = Integer.MAX_VALUE, a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        map.put(list.get(i).listNum, map.getOrDefault(list.get(i).listNum, 0) + 1);
        while (j < list.size()) {

            map.put(list.get(j).listNum, map.getOrDefault(list.get(j).listNum, 0) + 1);
            if (map.size() == nums.size()) {
                if (range > list.get(j).val - list.get(i).val) {
                    range = list.get(j).val - list.get(i).val;
                    a = list.get(i).val;
                    b = list.get(j).val;
                }
                //remove the ith element until the map size changes
                while (map.size() == nums.size()) {
                    if (range > list.get(j).val - list.get(i).val) {
                        range = list.get(j).val - list.get(i).val;
                        a = list.get(i).val;
                        b = list.get(j).val;
                    }
                    Entry x = list.get(i);
                    //which list is x in?
                    int l = x.listNum;
                    if (map.get(l) == 1) {
                        map.remove(l);
                    } else {
                        map.replace(l, map.get(l) - 1);
                    }
                    i++;
                }
            }
            j++;

        }
        while (map.size() == nums.size()) {
            if (range > list.get(j).val - list.get(i).val) {
                range = list.get(j).val - list.get(i).val;
                a = list.get(i).val;
                b = list.get(j).val;
            }
            Entry x = list.get(i);
            //which list is x in?
            int l = x.listNum;
            if (map.get(l) == 1) {
                map.remove(l);
            } else {
                map.replace(l, map.get(l) - 1);
            }
            i++;
        }
        return new int[]{a, b};
    }
}
