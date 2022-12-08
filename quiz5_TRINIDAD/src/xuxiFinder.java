public class xuxiFinder {
    private static final int GOAL = 12;

    private static int[] searchSpace = {4, 2, 9, 6, 5, 1, 3, 7, 8, 10, 11, 12};

    public static void main(String[] args) {
        int result = search(searchSpace, 0, searchSpace.length - 1);

        System.out.println(result);
    }

    // The search function
    private static int search(int[] array, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (array[mid] == GOAL) {
            return mid;
        }

        if (array[mid] < GOAL) {
            return search(array, mid + 1, end);
        }

        return search(array, start, mid - 1);
    }
}