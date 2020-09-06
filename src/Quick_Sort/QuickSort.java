package Quick_Sort;

// 분할 정복 Algorithm 으로 평균 속도가 O(N * logN)
// 원소 들을 둘로 나눔, 퀵 정렬은 기준 값이 있음 이를 '피벗' 이라고 함
// 가장 앞에 있는 값으로 피벗 설정
// 피벗 값을 기준으로 양쪽으로 찾는데, 왼쪽 에서 오른쪽 으로 갈때는 피벗 보다 큰값,
// 오른쪽에서 왼쪽으로 갈때는 피벗보다 작은 값을 찾고 둘을 바꿈
// 찾다가 큰값과 작은값의 인덱스가 엇갈리면 피벗값과 작은 값을 바꿈.
// 단 최악의 경우 시간 복잡도는 O(N * N)

public class QuickSort {
    public static int number = 10;
    public static int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

    public void quickSort(int[] data, int start, int end) {
        if (start >= end) {           // 원소가 1개인 경우
            return;
        }

        int key = start;        // 키는 첫번 째 원소 (피벗)
        int i = start + 1;      // 왼쪽 출발 지점
        int j = end;            // 오른쪽 출발 지점
        int temp;

        // 엇갈릴 때 까지 반복
        while (i <= j) {
            while (data[i] <= data[key]) {    // 키 값보다 큰 값을 만날 때 까지
                i++;
            }
            while (data[j] >= data[key] && j > start) {    // 키 값보다 작은 값을 만날 때 까지
                j--;
            }
            if (i > j) {               // 현재 엇갈린 상태면 키값과 교체
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {                    // 엇갈리지 않았다면 두개의 값 교체
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        // 재귀적 함수 이용
        // 데이터가 엇갈려서 바깥쪽으로 빠져나온다면
        // 키값을 기준으로 왼쪽과 오른쪽에서 각각 다시 퀵정렬을 수행 함
        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        q.quickSort(data,0,number-1);

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
