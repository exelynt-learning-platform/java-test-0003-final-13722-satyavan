package org.example;

public class JavaTest {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            int num;
            if(i%2==0){
                num=0;
            }else{
                num=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(num);
                if(num==1){
                    num=0;
                }else{
                    num=1;
                }
            }
            System.out.println();
        }
    }
}
