package classwork;

public class NestedLoopsDemo {
    public static void main(String[] args) {
        for(int i  =1; i <= 5; ++i) {
            for(int j = 1; j <= 10; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int size = 5;
        for(int i = size; i >= 1; --i) {
            for(int j = i; j >= 1; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
