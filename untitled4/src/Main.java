public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int h = 8;
        int  d = h / (a - b);
        if (a < h) {
            if (a > b & a>0 & b>0 & h>0) {
                System.out.println("crawls in " + d + " days");
            } else {
                System.out.println("impossible");
            }
        }else {
            System.out.println(" 1 day");
        }
    }
}





