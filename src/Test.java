import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            ArrayWrapper.add(i);
        }

        // 1.
        System.out.println("Method 1");
        System.out.println(ArrayWrapper.get(10));
        System.out.println();

        // 2. copy of sorted array
        System.out.println("Method 2");
        System.out.println(Arrays.toString(ArrayWrapper.sort()));
        System.out.println();

        // 3. remove by index
        System.out.println("Method 3");
        ArrayWrapper.remove(13);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 4. remove by value
        System.out.println("Method 4");
        ArrayWrapper.removeByValue(10);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 5. search by value
        System.out.println("Method 5");
        ArrayWrapper.search(50);
        System.out.println();

        // 6. returns revers of array
        System.out.println("Method 6");
        System.out.println(Arrays.toString(ArrayWrapper.revers()));
        System.out.println();

        // 7. returns sub array
        System.out.println("Method 7");
        System.out.println(Arrays.toString(ArrayWrapper.subArray(5, 10)));
        System.out.println();

        // 8. returns sum of all elements
        System.out.println("Method 8");
        System.out.println(ArrayWrapper.sum());
        System.out.println();

        // 9. add whole array
        System.out.println("Method 9");
        int[] newArr = new int[] {50, 67, 85};
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(newArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 10. add on specific position
        // if index greater then size -> throw ArrayIndexOutOfBoundsException
        System.out.println("Method 10");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(7, 88);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 11. prepend value
        System.out.println("Method 11");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.prepend(100);
        ArrayWrapper.prepend(200);
        ArrayWrapper.prepend(300);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();


        // 12. set new value instead old value
        // if index greater then size -> throw ArrayIndexOutOfBoundsException
        System.out.println("Method 12");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.set(4, 150));
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 13. search sub array
        System.out.println("Method 13");
        int[] testArr = new int[] {46, 45, 44};
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.searchSubArray(testArr));
        System.out.println();

        // 14. remove SubArray
        System.out.println("Method 14");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        int[] testDelArr = new int[] {46, 45, 44};
        ArrayWrapper.removeSubArray(testDelArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

    }
}
