package algorithm;

/**
 * 快速排序
 * 将一个数组从小到大或者从大到小排序
 * 思想：
 * 选取数组的一个元素作为基数
 * 所有元素与基数进行比较，以大小排在技术两边（两边的数之间无大小关系）
 * 将数组以基数为界分为两个数组，重复前面的行为
 */
public class QuickSort {
    public void sort(int[] array, int begin, int end) {
        int middle = 0;
        if (begin < end) {
            // 1.思想的前两步
            middle = part(array, begin, end);
            sort(array, begin, middle - 1);
            sort(array, middle + 1, end);
        }
    }

    int part(int[] array, int begin, int end) {
        int base = array[end];  // 选取最后最后元素作为基数
        int j = begin - 1;      // 比基数小的数组长度
        for (int i = begin; i < end; i++) {
            if (array[i] <= base) {
                // 如果当前元素比基数小，将当前元素放到比基数小的位置上
                j++;
                swap(array, i, j);   // 交换当前元素和j的下一个元素
            }
        }
        // 最后让base放在中间
        swap(array, j + 1, end);
        return j + 1;       // 返回分界点
    }

    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] arr = {99, 123, 4234, 56, 12, 44, 567, 2, 1, 0, 56, 2,28,777,32145,3};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        sort.sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
