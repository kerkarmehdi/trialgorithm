package pack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Double> t= new ArrayList<Double>();
        for(int i = 1 ; i<= 10; i++){
            t.add(Math.random()*100);
        }
        System.out.println(t.toString());
        Tri.Tri_Insertion(t);
        System.out.println(t.toString());
        
        /*t.add(1.0);
        t.add(2.0);
        t.add(1.0);
        t.add(2.0);
        Fusion(t, 1, 0, 3);
        System.out.println(t.toString());
        */
    }
    
}
