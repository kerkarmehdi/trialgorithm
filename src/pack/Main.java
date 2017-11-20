package pack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Double> t= new ArrayList<Double>();
        for(int i = 1 ; i<= 10; i++){
            t.add((double)i);
        }
        System.out.println(t.toString());
        long a = System.currentTimeMillis();
        Tri.Tri_Fusion_Insertion_D(t, 0, 9, 2);
        long b = System.currentTimeMillis();
        System.out.println(t.toString());
        System.out.println(a+"\n"+b+"\n"+(b-a));
        /*t.add(1.0);
        t.add(2.0);
        t.add(1.0);
        t.add(2.0);
        Fusion(t, 1, 0, 3);
        System.out.println(t.toString());
        */
    }
    
}
