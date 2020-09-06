package Insertion_Sort;

// 시간 복잡도 N^2 을 가진 정렬 Algorithm 중 가장 빠름
// 삽입 장렬은 앞에 있는 원소 들이 이미 정렬이 되어 있다고 가정
// 그 가정을 하는 특성 때문에 다른 정렬 보다 효율적
// 앞에 있는 원소를 살펴 보면서 들어갈 곳을 찾음
// 이미 거의 정렬이 되어 있다면 아주 성능이 좋음
public class InsertionSort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i = 0; i < 9; i++) {
            j = i;
            // arr[j+1] 보다 큰 값이 왼쪽에 있다면 자리를 바꿈 (모든 원소 확인 하지 않음)
            while (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
