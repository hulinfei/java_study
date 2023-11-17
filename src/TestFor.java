public class TestFor {
    public static void main(String[] args){
        int sum = 0;
        for (int i=1; i<=100; i++) {
            sum = sum + 1;
            System.out.println(sum);
        }
        int[] arr = { 1,2,3,4,5 };
        int sum_arr = 0;
        for ( int i=0; i < arr.length; i++){
            sum_arr = sum_arr + arr[i];
        }
        System.out.println("数组之和等于"+ sum_arr);
        for (int i=0; i < arr.length; i++){
            if (arr[i] == 2){
                continue;
            }
            if (i ==3 ){
                break;
            }
            System.out.println("索引"+i);
            System.out.println(arr[i]);
        }
        for (int ar : arr) {
            System.out.println("遍历数组");
         System.out.println(ar);
        }
    }
}
