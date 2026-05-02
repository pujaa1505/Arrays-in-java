import java.util.Arrays;  
class array {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6};
        int[] copy = a.clone();

        System.out.println("Copied using clone():");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}

class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        int[] copy = new int[a.length];

        System.arraycopy(a, 0, copy, 0, a.length);

        System.out.println("Copied using System.arraycopy():");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}

class ArrayCopyOf {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};

        int[] copy = Arrays.copyOf(a, a.length);

        System.out.println("Copied using Arrays.copyOf():");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}