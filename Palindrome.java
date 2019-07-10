import java.util.ArrayList;
//Nikola Mladenovski
public class Palindrome {

    public static void palindromeTest(ArrayList<?> myList){
        int listSize=myList.size();
        boolean flag=true;
        for(int i = 0;i<Math.floor(listSize/2);i++){
            int start = i;
            int end = listSize-i-1;

            if(!myList.get(start).equals(myList.get(end))){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("The Array is palindrome");
        }else{
            System.out.println("The Array is not palindrome");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(1);

        palindromeTest(list);
        System.out.println(list.toString());


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("first");
        list2.add("second");
        list2.add("second");
        list2.add("first");
        list2.add("third");

        palindromeTest(list2);
        System.out.println(list2.toString());
    }
}
