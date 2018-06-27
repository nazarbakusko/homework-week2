public class ArrayWrapper {

    private ArrayWrapper() {
    }

    private static int[] arr = new int[10];
    private static int size = 0;

    public static void add(int num) {
        if (size >= arr.length) {
            extendArray();
        }
        arr[size++] = num;
    }

    private static void extendArray() {
        int[] newArr = new int[size << 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static int[] getArr() {
        return arr.clone();
    }

    // returns element by index
    public static int get(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else
            throw new IndexOutOfBoundsException();
    }

    // copy of sorted array
    public static int[] sort() {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    // remove by index
    public static void remove(int index) {
        if (index < arr.length) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            for (int i = index; i < arr.length - 1; i++) {
                newArr[i] = arr[i + 1];
            }
            arr = newArr;
        } else
            throw new IndexOutOfBoundsException();
    }

    // remove by value
    public static void removeByValue(int value) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] == value) {
                j--;
            } else {
                newArr[j] = arr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
        arr = newArr;
    }

    // search by value
    public static void search(int value) {
        int times = 0;
        for (int tmp : arr) {
            if (tmp == value) {
                times++;
            }
        }
        System.out.println("Value was found " + times + " times");
    }

    // returns revers of array
    public static int[] revers() {
        int[] newArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArr[i] = arr[j];
        }
        arr = newArr;
        return arr;
    }

    // returns sub array
    public static int[] subArray(int start, int end) {
        int[] newArr = new int[end - start + 1];
        for (int i = start, j = 0; i <= end; j++, i++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }

    // returns sum of all elements
    public static int sum() {
        int sum = 0;
        for (int tmp : arr) {
            sum += arr[tmp];
        }
        return sum;
    }

    // add whole array
    public static void add(int[] newArr) {
        int[] secondNewArr = new int[arr.length + newArr.length];
        System.arraycopy(arr, 0, secondNewArr, 0, arr.length);
        System.arraycopy(newArr, 0, secondNewArr, arr.length, newArr.length);
        arr = secondNewArr;
    }

    // add on specific position
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static void add(int index, int value) {
        int[] newArr = new int[arr.length + 1];
        if (index < arr.length) {
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index, newArr, index + 1, newArr.length - 1 - index);
            newArr[index] = value;
            arr = newArr;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    // prepend value
    public static void prepend(int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        newArr[0] = value;
        arr = newArr;
    }

    // set new value instead old value
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static int[] set(int index, int value) {
        if (index < arr.length) {
            for (int tmp : arr) {
                if (tmp == index) {
                    arr[tmp] = value;
                }
            }
        } else
            throw new IndexOutOfBoundsException();
        return arr;
    }

    // search sub array
    public static int searchSubArray(int[] subArray) {
        int changedLength = subArray.length;
        int limitLength = arr.length - subArray.length;
        for (int i = 0; i < limitLength; i++) {
            if (arr[i] == subArray[0]) {
                for (int j = 0; j < subArray.length; j++) {
                    if (arr[i + j] == subArray[j]) {
                        changedLength--;
                        if (changedLength == 0) {
                            return i;
                        }

                    }

                }
            }

        }
        return -1;
    }

    public static void removeSubArray(int[] subArray) {
        if(searchSubArray(subArray)!= -1){
            int index = searchSubArray(subArray);
            for (int i = index; i < index + subArray.length; i++) {
                remove(i);
            }
        }
    }
}

