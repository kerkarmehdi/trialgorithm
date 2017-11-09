package pack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> t = new ArrayList<Integer>();
		int d=0,f=9;
		for(int i=0;i<=f;i++) {
			t.add((int)(Math.random()*100));
		}
		System.out.println("tableau t[]: "+t.toString());
		triFusion(t,d,f);
		
		
		/*
		ArrayList<Integer> l = new ArrayList<Integer>(6);
		for(int i=1 ; i<=5 ; i++) {
			l.add(t.get(d+i-1));
		}
		ArrayList<Integer> r = new ArrayList<Integer>(6);
		for(int j=1;j<=5;j++) {//5=9-4=f-m
			r.add(t.get(4+j));//m=4
		}
		*/
		//l.add(6,Integer.MAX_VALUE-1);
		//r.add(5+1,Integer.MAX_VALUE-1);
		
		//System.out.print("tableau l[]: "+l.toString());
		//System.out.println(":"+r.toString());
		System.out.println("tableau t[]: "+t.toString());

	}
	public static void triFusion(ArrayList<Integer> t,int d, int f) {
		int m = 0;
		if(d<f) {
			m=(int)(f+d)/2;
			triFusion(t,d,m);
			triFusion(t,m+1,f);
			fusion(t,d,m,f);
			//System.out.println("    m+1= "+(m+1)+"    f= "+f);
		}

		
		
		
	}
	public static void fusion(ArrayList<Integer> t,int d, int m, int f) {
		int t1=m-d+1,t2=f-m;
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		
		for(int i=1 ; i<=t1 ; i++) {
			l.add(t.get(d+i-1));
		}
		for(int j=1;j<=t2;j++) {
			r.add(t.get(m+j));
		}
		l.add(t1+1,Integer.MAX_VALUE);
		r.add(t2+1,Integer.MAX_VALUE);
		
		int i=0,j=0;
		for(int k=d;k<=f;k++) {
			if(l.get(i)==null){
				t.set(k, r.get(j));j++;
			}	
			if(r.get(j)==null){
				t.set(k, l.get(i));i++;
			}
					
			if(l.get(i)<=r.get(j)) {
				t.set(k, l.get(i));
				i++;
			}else {
				t.set(k, r.get(j));
				j++;
				
			}
		}
	}
	
}
