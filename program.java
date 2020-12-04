import java.util.Scanner;

public class perkalianRusia {

    public static int x;
    public static int y;

    public static void main(String[] args) {
        // deklarasi variabel
        
       
        int total = 0;
        int a;
        int b;
        
       
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.print("masukkan nilai a : ");
        a = x = keyboard.nextInt();

        System.out.print("masukkan nilai b : ");
        b = y = keyboard.nextInt();
        
        while (a > 0){
            if (a%2==1) 
           
                total+=b;
            
            a/=2;
            b*=2;
        }
        
        
        
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        
        System.out.println("a :"+x);
        System.out.println("b :"+y);
        System.out.println("b :"+x);
        
        System.out.println("hasil perkalian :  " + total);
    }

}
