import java.util.Arrays;
public class TestArray {
    public static void main(String[] args){
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println(Arrays.toString(ns));
        for (int i=0; i < ns.length - 1; i ++){
            for (int j=0; j< ns.length -i -1; j ++) {
                if (ns[j] > ns[j+1]) {
                    int t = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
        /*Arrays.sort(ns);*/
    }
}
