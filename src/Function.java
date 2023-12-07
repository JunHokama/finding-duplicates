import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Function {
    public List<Integer> containsDuplicates(Integer [] arr){

        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(Integer x: arr){
            if(set.contains(x)){
                duplicates.add(x);
            }
            else set.add(x);
        }

        return duplicates;
        }
}
