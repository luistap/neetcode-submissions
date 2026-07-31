class Solution {
    public boolean isAnagram(String s, String t) {

        // handle different lengths right away
        if (s.length() != t.length()) {
            return false;
        }

        // average case
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String letter = s.charAt(i) + "";
            if (map.containsKey(letter)) {
                // increase count
                map.put(letter, map.get(letter) + 1);
            } else {
                // new letter
                map.put(letter, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            String letter = t.charAt(i) + "";
            if (map.containsKey(letter)) {
                // decrease the count
                map.put(letter, map.get(letter) - 1);
                if (map.get(letter) == 0) {
                    // remove the entry
                    map.remove(letter);
                }
            } else {
                // letter isn't contained
                return false;
            }
        }
        return true;
    }
}
