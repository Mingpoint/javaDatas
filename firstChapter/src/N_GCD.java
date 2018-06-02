/**
 * Created by Mingpoint on 2018/6/2.
 * n个树的最大公约数
 * @Description:
 */
public class N_GCD {
    public static void main(String[] args) {
        int [] ns = {75,45,25,95,60,55};
//        loopFun(ns);
        recursionFun(ns);
    }


//  循环方式
    public static void loopFun (int[] ns) {
        N_GCD gc = new N_GCD();
        int a = 0;
        for (int i = 1; i < ns.length; i++) {
            a = ns[i - 1];
            int b = ns[i];
            a = gc.gcd(a, b);
        }
        System.out.println(a);
    }
//递归方式
public static void recursionFun (int[] ns) {
    N_GCD gc = new N_GCD();
    int ag = 0;
    for (int i = 1; i < ns.length; i++) {
        int a = ns[i - 1];
        int b = ns[i];
        ag = gc.recursionGcd(a,b);
    }
    System.out.println(ag);
}

    public int recursionGcd (int a,int b) {
        int tmp = 0;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        int i = a % b;
        if (i == 0) {
            return b;
        } else {
            return recursionGcd(b,i);
        }
    }


    public int gcd (int a,int b) {
        int tmp = 0;
        while (0 != b) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
