
package pack;

import java.util.ArrayList;


public class Tri {
    
    public static void Tri_fusion_R_C(ArrayList<Double> t, int a, int b)
    {   
        int q;
        if (a<b)
        {    q=(int)(a+b)/2;
            Tri_fusion_R_C(t, a, q);
            Tri_fusion_R_C(t, q+1, b);
            Fusion_C(t,q,a,b);
        }
    }
    
    public static void Fusion_C(ArrayList<Double> t, int q, int a, int b)
    {
        int n1=q-a+1,n2=b-q;
                
        ArrayList<Double> l,r;
        l=new ArrayList<Double>();
        r=new ArrayList<Double>();
        
        //System.out.println("l=============");
        for(int i=0;i<n1;i++)
        {
            
            l.add(t.get(a+i));
            //System.out.println(l.toString());
        }
        //System.out.println("r=============");
        for(int j=1;j<=n2;j++)
        {
            
            r.add(t.get(q+j));
            //System.out.println(r.toString());
        }
        l.add(Double.MAX_VALUE);
        r.add(Double.MAX_VALUE);
        int i=0,j=0;
        for(int k=a;k<=b;k++){
            
            if(l.get(i) < r.get(j)){
                t.set(k, l.get(i));
                i++;
            }else{ 
                t.set(k, r.get(j));
                j++;
            }
        }
        //System.out.println("t = "+t.toString());
    }
    
    public static void Tri_fusion_R_D(ArrayList<Double> t, int a, int b)
    {   
        int q;
        if (a<b)
        {    q=(int)(a+b)/2;
            Tri_fusion_R_D(t, a, q);
            Tri_fusion_R_D(t, q+1, b);
            Fusion_D(t,q,a,b);
        }
    }
    
    public static void Fusion_D(ArrayList<Double> t, int q, int a, int b)
    {
        int n1=q-a+1,n2=b-q;
                
        ArrayList<Double> l,r;
        l=new ArrayList<Double>();
        r=new ArrayList<Double>();
        
        //System.out.println("l=============");
        for(int i=0;i<n1;i++)
        {
            
            l.add(t.get(a+i));
            //System.out.println(l.toString());
        }
        //System.out.println("r=============");
        for(int j=1;j<=n2;j++)
        {
            
            r.add(t.get(q+j));
            //System.out.println(r.toString());
        }
        l.add(Double.MIN_VALUE);
        r.add(Double.MIN_VALUE);
        int i=0,j=0;
        for(int k=a;k<=b;k++){
            
            if(l.get(i) < r.get(j)){
                t.set(k, l.get(i));
                i++;
            }else{ 
                t.set(k, r.get(j));
                j++;
            }
        }
        //System.out.println("t = "+t.toString());
    }
    
    public static void Tri_Bull_D(ArrayList<Double> t){
        for(int i = 0; i<t.size();i++){
            for(int j = i+1; j<t.size();j++){
                if(t.get(i) < t.get(j))
                    Tri.Tronspos(t,i,j);
            }
        }
    }
    
    public static void Tri_Bull_C(ArrayList<Double> t){
        for(int i = 0; i<t.size();i++){
            for(int j = i+1; j<t.size();j++){
                if(t.get(i) > t.get(j))
                    Tri.Tronspos(t,i,j);
            }
        }
    }
    
    public static void Tronspos(ArrayList<Double> t,int i, int j){
        double e;
        e = t.get(i);
        t.set(i, t.get(j));
        t.set(j, e);
        
    }
    //i est le premier element et j et le deuxieme i=0 j=1
    public static void Tri_Bull_R_D(ArrayList<Double> t,int i, int j){
        if(i<t.size() && j<t.size()){
            if(t.get(i) < t.get(j))
                Tronspos(t, i, j);
            Tri_Bull_R_D(t, i, j+1);
            if(i==j-1)
                Tri_Bull_R_D(t, i+1, j+1);
        }
    }
    
    public static void Tri_Bull_R_C(ArrayList<Double> t,int i, int j){
        if(i<t.size() && j<t.size()){
            if(t.get(i) > t.get(j))
                Tronspos(t, i, j);
            Tri_Bull_R_C(t, i, j+1);
            if(i==j-1)
                Tri_Bull_R_C(t, i+1, j+1);
        }
    }
    
    public static void Tri_Insertion_D(ArrayList<Double> t) {
    	int j,si;
    	for(int i=1;i<t.size();i++) {
    		j=i-1;
    		si = i;
    		while(j != -1 && t.get(j)<t.get(si)) {
    			Tronspos(t, j, si);
    			j--;
    			si--;
    		}
    	}
    }
    
    public static void Tri_Insertion_C(ArrayList<Double> t) {
    	int j,si;
    	for(int i=1;i<t.size();i++) {
    		j=i-1;
    		si = i;
    		while(j != -1 && t.get(j)>t.get(si)) {
    			Tronspos(t, j, si);
    			j--;
    			si--;
    		}
    	}
    }
    
    
    
}
