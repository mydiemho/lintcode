package String;

/**
 * Created by myho on 7/12/15.
 */

/*
 * Lintcode
 */
public class RemoveElement {
    public static int removeElement(int[] A, int elem) {

        // to modify array in place, we'll use 2 index
        // resultIndex keeps track of the *new* array, where the tail is
        // while index is used to loop through the array
        int resultIndex = 0;
        int index = 0;

        while(index < A.length)
        {
            // finally found a nonremoval element, moves that to the tail of the result array
            if(A[index] != elem) {
                A[resultIndex++] = A[index++];
            } else {
                // keep going through until we see a nonremoval element
                index++;
            }
        }

        return resultIndex;
    }

    public static void main(String[] args)
    {
        int[] A = {0,4,4,0,4,4,4,0,2};
        System.out.println(removeElement(A, 4));
    }
}
