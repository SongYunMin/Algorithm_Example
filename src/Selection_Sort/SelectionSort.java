package Selection_Sort;

// 선택정렬 : 가장 작은것을 선택하여 앞으로 보냄
public class SelectionSort {
    public static void main(String[] args) {
        int i, j, min, index = 0, temp;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i = 0; i < arr.length; i++) {
            min = 9999;             // 초기 값 모든 원소보다 큰 숫자
            for (j = i; j < 10; j++) {      // 배열에서 최소 값을 찾음
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            // 가장 앞에 있는 것과 최소 값을 바꾸겠다는 뜻
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
