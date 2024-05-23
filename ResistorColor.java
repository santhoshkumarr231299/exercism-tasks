import java.util.*;
class ResistorColor {
    private static final HashMap<String,Integer> map = new HashMap();
    static {
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        
    }
    public int colorCode(String color) {
        return map.get(color.toLowerCase());
        
    }

    public String[] colors() {
        // return map.keySet().toArray(new String[0]);
        return new String[] {
            "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
        };
    }
}

