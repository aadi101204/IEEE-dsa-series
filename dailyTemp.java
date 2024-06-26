class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] days = new int[l];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < l; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                days[index] = i - index;
            }
            stack.push(i);
        }

        return days;
    }
}
