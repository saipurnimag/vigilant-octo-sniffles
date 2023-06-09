package Leetcode;

import java.util.HashMap;

public class Codec {

    HashMap<String, String> map;

    Codec(){
        map = new HashMap<>();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String a = String.valueOf(longUrl.hashCode());
        map.put(a,longUrl);
        return a;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Leetcode.Codec object will be instantiated and called as such:
// Leetcode.Codec codec = new Leetcode.Codec();
// codec.decode(codec.encode(url));