class Solution {

     public String encode(List<String> strs) {
        return strs.stream().reduce("", (result, ch) -> result+ch+"你");

    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        String[] parts = str.split("你", -1);

        return new ArrayList<>(
                Arrays.asList(parts).subList(0, parts.length - 1)
        );
    }

}
