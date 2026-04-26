class Solution {
    public  List<List<Integer>> threeSum(int[] numbers) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(numbers);
        int n =numbers.length;
        Map<Integer, Integer> count = new HashMap<>();
         for (int num : numbers) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for(int i=0;i<n;i++){
             count.put(numbers[i], count.get(numbers[i]) - 1);
            if(i>0 && numbers[i] == numbers[i-1]) continue;
        for(int j=i+1;j<n;j++){
                count.put(numbers[j], count.get(numbers[j]) - 1);
                if(j>i+1 && numbers[j] == numbers[j-1]) continue;
                int target = - (numbers[i] + numbers[j]);
                if(count.getOrDefault(target, 0) > 0){
                    result.add(Arrays.asList(numbers[i], numbers[j], target));
                }
        }  
        for(int j=i+1;j<n;j++){
                count.put(numbers[j], count.get(numbers[j]) + 1);
        }
        }
          
        return result;
    }
}
