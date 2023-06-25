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

