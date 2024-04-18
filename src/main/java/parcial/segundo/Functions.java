package parcial.segundo;

import java.util.ArrayList;
import java.util.List;

public class Functions {

    private Functions(){
        throw new IllegalStateException("Utility class");
    }

    public static List<Integer> factors(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i<=n ; i++){
           int module = n % i ;
           if(module == 0 ) a.add(i);

        }
        return a;
    }

    public static List<Integer> prime(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<=n ; i++){
           if(factors(i).size() == 2) a.add(i);
        }
        return a;
    }

}
