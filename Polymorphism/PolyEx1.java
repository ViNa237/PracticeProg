package Polymorphism;
class Addition{
    public static int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b,int c){
        return a+b+c;
    }
    public long sum(long a, int b){
        return a+b;

    }
    public static long sum(long a, int b,long c){
        return a+b+c;
    }
}
public class PolyEx1 {
    public static void main(String[] args){
        System.out.println(Addition.sum(10,20));
        Addition a=new Addition();
        System.out.println(a.sum(20036L,200));
        System.out.println(a.sum(2003,20));
        System.out.println(Addition.sum(23015l,203,42584l));
    }
}
