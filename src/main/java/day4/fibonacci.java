package day4;

public class fibonacci {
    public static void main(String[] args) {
        int number = 10,x=0,y=1,res=0;
        System.out.print(x+" "+y);
        for(int i=2;i<number;i++){

            res=x+y;
            x=y;
            y=res;
            System.out.print(" "+res);
        }
    }
}
