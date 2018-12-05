import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int date[]={10,20,56,89,87,78,56,21,30,77};
        for (int i=0;i<10;i++){
            if (date[i]>=m){
                System.out.println(date[i]);
            }
        }
    }
}
