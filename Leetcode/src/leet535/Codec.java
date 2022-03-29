package leet535;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<Integer,String> map = new HashMap<>();
    int i = 1001;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(i,longUrl);
        return "http://tinyurl.com/" + i;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String replace = shortUrl.replace("http://tinyurl.com/", "");
        int shortI = Integer.parseInt(replace);
        return map.get(shortI);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
