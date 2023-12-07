import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,6,6,7,8,9,10,10,1,2};

        Function function = new Function();

        List<Integer> duplicates = function.containsDuplicates(arr);


        System.out.println(duplicates.toString());


    }
}