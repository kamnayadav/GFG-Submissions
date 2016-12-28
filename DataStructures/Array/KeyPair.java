import java.util.*;
import java.util.Arrays;
import java.lang.*;

//Given an array A[] of n numbers and another number x, determine whether or not there exist two elements in A whose sum is exactly x.
//
//Input:
//
//The first line of input contains an integer T denoting the number of test cases.
//The first line of each test case is N and X,N is the size of array.
//The second line of each test case contains N integers representing array elements C[i].
//
//Output:
//
//Print "Yes" if there exist two elements in A whose sum is exactly x, else "No" without quotes.

class KeyPair {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCaseCount = in.nextInt();
        for(int i = 0;i < testCaseCount; i++) {
            int sizeOfArr = in.nextInt();
            int finalSumToMatch = in.nextInt();
            int iArr[] = new int[sizeOfArr];

            for (int j = 0; j < sizeOfArr; j++) {
                iArr[j] = in.nextInt();
            }

            // sorting array
            Arrays.sort(iArr);
            int sumVal = 0;
            int l = 0;
            int r = sizeOfArr - 1;
            while(l < r) {
                sumVal = iArr[l] + iArr[r];
                if(sumVal < finalSumToMatch) {
                    l = l + 1;
                    continue;
                }
                else if(sumVal > finalSumToMatch){
                    r = r - 1;
                    continue;
                }

                if(sumVal == finalSumToMatch) {
                    System.out.println("Yes");
                    break;
                }
            }
            if(sumVal != finalSumToMatch && l >= r) {
                System.out.println("No");
            }

        }
    }
}