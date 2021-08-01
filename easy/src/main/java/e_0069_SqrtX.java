/**
 * 平方根整數
 */
public class e_0069_SqrtX {

    public static void main(String[] args) {
        int s = mySqrt(2147395600);
//        int s = mySqrt(8);
        System.out.println(s);
    }

    public static int mySqrt(int x) {
//
        long a = 0;
        do {
            a += 1;
            System.out.println(a + "*" + a + "=" + a * a + "---" + x);

        } while (a * a <= x);

        return (int) (a - 1);

    }
}
