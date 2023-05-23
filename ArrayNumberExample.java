import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayNumberExample {
    public static void main(String[] args) {
        List<Integer> numberlist = Arrays.asList(9,5,3,87,3,8,1,2,8,5,0,8,4);
//Sum of all Number;
Optional<Integer>  sum = numberlist.stream().reduce((a,b)-> a+b);
System.out.println("Sum of array list "+sum.get());
        int sumofList = numberlist.stream().reduce(0,Integer::sum);
        System.out.println("Another Way"+ sumofList);
    }
}
