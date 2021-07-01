public class Runner9 {
    public static void main(String[] args) {
     LinkedListUC9<Integer> numberList = new LinkedListUC9<>();
        numberList.add(56);
        numberList.add(30);
        numberList.add(40);
        numberList.add(70);
        System.out.println("Linked list elements");
        numberList.show();
        System.out.println();
        int searchResult = numberList.searchByValue(40);
        numberList.popAtIndex(searchResult);
        numberList.show();
        System.out.println("The size of the list is " + numberList.size());
    }
}
