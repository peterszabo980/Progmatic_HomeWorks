package hu.progmatic;

public class HW_20220302_3 {
    public static void main(String[] args) {

        System.out.println("1. feladat");
        int j = 5, i = 10;
        j += j * 2 == i ? j : i % 3;
        System.out.println("A j éréke: " + j);
        System.out.println();

        System.out.println("2. feladat");
        int n = 0;
        n -= (n % 2 > 0) ? 1 + 2 * n : n - 3;
        System.out.println("Az n értéke: " + n);
        System.out.println();

        System.out.println("3. feladat");
        int b = 9;
        boolean a = ++b % 5 == 0 ? b == 10 : b != 9;
        System.out.println("Az a érték állítása: " + a);
        System.out.println();;

        System.out.println("4. feladat");
        boolean l = false, m = true, o = true;
        boolean q = l  || m ? !( l || m && o ) : m && ! o;
        System.out.println("Az q érték állítása: " + q);
        System.out.println();

        System.out.println("Az 5. feladat");
        int f = 1;
        boolean e = !false == (10%3 == f);
        int g = e ? f -= (++f * -1) : f+ (f+f) * ++f;
        System.out.println("A g értéke: " + g);
        System.out.println();

        System.out.println("A 6. feladat");
        int v = 5, x = v * --v;
        boolean y = x % v < 0 ? v == 0 : !false;
        boolean z = !y && x == v * v;
        System.out.println("A z érték állítása: " + z);
    }
}
