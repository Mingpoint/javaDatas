/**
 * Created by Mingpoint on 2018/6/2.
 * 最大公约数
 * @Description:
 */
public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        int gcd1 = gcd.gcd(90, 80);
        System.out.println(gcd1);
    }
    public int gcd(int a,int b) {
        int tmp=0;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
