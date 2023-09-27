package Array;

public class CreateArray {
//    Declare static array variable with type of elements of length 10
static int[] newArray = new int[10];

//Number of position to rotate the array to the right
int positionsToRotate = 1;

//Constructor to initialize the elements of array
    public CreateArray() {
        System.out.println("newly Created Array List");
//        initialize the elements of the array from 1 to 10
        for (int i = 0; i < 10; i++) {
            newArray[i] = i + 1;
//          print the array of elements
            System.out.println(newArray[i]);
        }
//        Call the rotateArrayRight method to rotate the array
        rotateArrayRight(newArray, positionsToRotate);
    }

//    Method to rotate an array to the right by a specified number of positions
    public void rotateArrayRight(int[] arr, int positions){
        int length = arr.length;
        positions = positions % length;
        int[] temp = new int[length];

        // Perform the rotation and store it in the temporary array
        for (int i = 0; i < length; i++){
            temp[(i + positions) % length] = arr[i];
        }
//        copying the rotated elements back to the original array
        System.arraycopy(temp, 0, arr, 0, length);

//        print the rotated array
        System.out.println(" The new rotated array list");
        for(int num : CreateArray.newArray) {
            System.out.println(num + " ");
        }
}
}
