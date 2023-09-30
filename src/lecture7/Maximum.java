package lecture7;

public class Maximum {
    public static void main(String[] args) {
        int data[] = {99990, 20, 30, 8090, 5, 50, 6000, 70, 80, 90, 22, 6077, 889, 792, 256, 234, 34, 340,};
        System.out.println(data.length);
        maximum(data);
    }
    public static void maximum(int max[]) {
        int mx = max[0];
        for (int i = 0; i <= max.length - 1; i++) {
            if (max[i] >= max[1] + max[17]) {
                System.out.println(max[i]);
             //why more value print in maximum ??
            }
        }
}}
