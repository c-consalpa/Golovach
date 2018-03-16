package OOP._23;

/**
 * Created by c-consalpa on 3/1/2018.
 */
public class Outer {
    public int i = 5;

    public static class Inner {
        int i = 123;

        public void f() {
            System.out.println(++i);
        }
    }
}


class Test {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner ins = new Outer.Inner();
        ins.f();
    }
}
