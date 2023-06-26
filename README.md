# ProblemSolving_Assignment
## Given an array of integers and a target value, you must determine which integers' sum equals the target 

 Given an array of integers and a target value, you must determine which two integers sum
equals the target and returns a 2D array. Then merge the array into a single array with sorting (
ascending ) order, in the next step double the target value and find again the combination of
digits (can be multiple digits ) that are equal to the double targeted value and returned into a 2D
array.
Sample Input : [1, 3, 2, 2, -4, -6, -2, 8];
Target Value = 4,
Output: First Combination For “4” : [ [1,3],[2,2],[-4,8] ];
Merge Into a single Array : [-4,1,2,2,2,3,8];
Second Combination For “8” : [ [ 1,3,2,2], [8,-4,2,2],....,[n,n,n,n] ]

## Time & Space Complexity Analysis
#### findPairs method:

Time Complexity: The method uses a map to store elements from the array, and then it iterates over the array once. The operations performed inside the loop (such as checking for complement and adding elements to the result list) have constant time complexity. Therefore, the overall time complexity of this method is O(n), where n is the length of the input array.
Space Complexity: The method uses a map to store elements, which can potentially have a maximum of n entries if all elements are distinct. The result list will also store at most n/2 pairs (assuming each pair is unique). Therefore, the space complexity of this method is O(n).

#### combinationSum method:

Time Complexity: The method uses a recursive approach to find all combinations that sum up to the target. It utilizes backtracking to explore different combinations. The time complexity depends on the number of valid combinations that satisfy the target sum. In the worst case, where all combinations are valid, the time complexity can be exponential. However, by utilizing the sorting and duplicate skipping technique, the method avoids exploring redundant combinations, reducing the actual time complexity. On average, the time complexity is considered to be better than the worst case. Therefore, the time complexity is typically lower than O(2^n).

Space Complexity: The method uses a list of lists (combinations) to store all valid combinations. In the worst case, where all combinations are valid, the number of combinations can also be exponential. Therefore, the space complexity can be O(2^n). However, the space complexity can be further reduced if duplicates are skipped during the combination generation. The space complexity also depends on the target value and the number of distinct valid combinations. In general, the space complexity is considered to be high due to the potential exponential growth in the number of combinations.

Overall, the time and space complexities of the findPairs method are O(n), while the time and space complexities of the combinationSum method can vary but are typically better than O(2^n).

## Testing Input:
 int[] arr = {1, 3, 2, 2, -4, -6, -2, 8};
        int target = 4;
## Testing Output :
"C:\Program Files\Java\jdk-17.0.4.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.4\lib\idea_rt.jar=53007:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.4\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\DELL\Downloads\ProblemSolving_Assignment\target\classes org.example.ArraySum

Pairs that sum up to the target:
First Combination For "4":
[3, 1]
[2, 2]
[8, -4]

Merge Into a Single Array :
[-4, 1, 2, 2, 3, 8]

Second Combination For "8":
[[-6, -2, 1, 2, 2, 3, 8], [-6, 1, 2, 3, 8], [-4, -2, 1, 2, 3, 8], [-4, 1, 3, 8], [-4, 2, 2, 8], [-2, 2, 8], [1, 2, 2, 3], [8]]

Process finished with exit code 0

