public class Runner6 {
    public static void main(String[] args) {
        LinkedListUC6<Integer> numberList = new LinkedListUC6<>();
        numberList.add(56);
        numberList.add(30);
        numberList.add(70);
        System.out.println("Array before popLast");
        numberList.show();
        System.out.println();
        numberList.popLast();
        System.out.println("Array after popLast");
        numberList.show();
    }
}
