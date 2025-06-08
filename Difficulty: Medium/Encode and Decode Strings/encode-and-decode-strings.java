class Solution {

    // Encodes a list of strings to a single string.
    public String encode(String[] strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public String[] decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // find the delimiter #
            while (s.charAt(j) != '#') {
                j++;
            }

            // extract the length
            int length = Integer.parseInt(s.substring(i, j));
            j++; // skip the #

            // extract the string using the length
            String str = s.substring(j, j + length);
            result.add(str);

            i = j + length;
        }

        return result.toArray(new String[0]);
    }
}
