import java.util.ArrayList;
class arr1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println("Original: " + arr);
        arr.set(1, 9);
        System.out.println("After set: " + arr);
        arr.remove(Integer.valueOf(7));
        System.out.println("After remove: " + arr);
        System.out.println("Contains 5 " + arr.contains(5));
        System.out.println("Contains 7 " + arr.contains(7));
        arr.sort(null); 
        System.out.println("After sort: " + arr);
    }
}