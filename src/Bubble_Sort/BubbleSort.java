package Bubble_Sort;

// 버블 정렬 : 모든 원소를 N^2 반복 하여 왼쪽 값이 오른쪽 값보다 크다면 바꿈
public class BubbleSort {
    public static void main(String[] args){
        int[] arr={5,7,1,4,8,10,3,6,9,2};

        // 반복을 위한 i, j 그리고 값을 바꾸기 위한 temp 변수
        int i,j,temp;

        // Loop Area
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){      // 왼쪽 값이 오른쪽 값보다 크다면?
                    temp = arr[j];          // 위치 교환
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
