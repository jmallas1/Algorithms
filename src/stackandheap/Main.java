package stackandheap;

public class Main {

        public static void main(String[] args) {
            int i=1;
            Object obj = new Object();
            Main mem = new Main();
            mem.foo(obj);
        }

        private void foo(Object param) {
            boolean yesno = true;
            String str = param.toString();
            System.out.println(str);
        }

}
