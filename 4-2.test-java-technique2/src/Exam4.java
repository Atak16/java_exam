import java.util.HashMap;
import java.util.Map;

public class Exam4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("東京", "東京");
        map.put("埼玉", "さいたま");
        map.put("茨城", "水戸");
        map.put("沖縄", "那覇");

        String key1 = map.get("埼玉");
        String capital1 = key1;
        System.out.println(key1 + "埼玉の県庁所在地は" + capital1 + "です");

        String key2 = map.get("沖縄");
        String capital2 = key2;
        System.out.println("沖縄の県庁所在地は" + capital2 + "です");
    }
}
