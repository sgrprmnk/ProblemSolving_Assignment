package org.example;

import java.util.*;

public class ArraySum {
    public static int[][] findPairs(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                result.add(new int[]{arr[i], complement});
            }

            map.put(arr[i], i);
        }

        return result.toArray(new int[0][]);
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates properly
        findAllCombination(combinations, new ArrayList<>(), nums, target, 0);
        return combinations;
    }
    private static void findAllCombination(List<List<Integer>> combinations, List<Integer> currentCombination, int[] nums, int target, int start) {
        if (target < 0) {
            return; // Target exceeded, backtrack
        } else if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination)); // Valid combination found
        } else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue; // Skip duplicates
                }
                currentCombination.add(nums[i]);
                findAllCombination(combinations, currentCombination, nums, target - nums[i], i + 1);
                currentCombination.remove(currentCombination.size() - 1); // Remove the last element to backtrack
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, -4, -6, -2, 8};
        int target = 4;

        // Find pairs that sum up to the target
        int[][] pairs = findPairs(arr, target);

        // Print the pairs
        System.out.println("Pairs that sum up to the target:");
        System.out.println("First Combination For \"" + target + "\":");
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
        System.out.println("Merge Into a Single Array :");
int[] mergedArray=Arrays.stream(pairs).flatMapToInt(Arrays::stream).sorted().toArray();
        System.out.println(Arrays.toString(mergedArray));

        target =target*2;
        List<List<Integer>> combinations = combinationSum(arr, target);

        // Print the combinations
        System.out.println("\nSecond Combination For \"" + (target) + "\":");

        int[][] combinationsArray = combinations.stream()
                .map(innerList -> innerList.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        System.out.println(Arrays.deepToString(combinationsArray));

    }
}

