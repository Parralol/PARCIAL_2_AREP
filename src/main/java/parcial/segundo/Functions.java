package parcial.segundo;

import java.util.ArrayList;

public class Functions {
    public static ArrayList<Integer> factors(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i<=n ; i++){
           int module = n % i ;
           if(module == 0 ) a.add(i);

        }
        return a;
    }

    public static ArrayList<Integer> prime(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<=n ; i++){
           if(factors(i).size() == 2) a.add(i);
        }
        return a;
    }

}
