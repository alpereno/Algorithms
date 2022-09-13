package ChapterOne.Two;

import java.util.Random;
import java.util.Scanner;

public class ChapterOnePointTwo {
    
    public static void main(String[] args) {
        // PAGE 81
        
        // isPalindrome
        String palindromeString = "aaabbaaa";
        System.out.println(isPalindrome(palindromeString));
        
        // file and extension
        String fileName="PersonalData.txt";
        int dot = fileName.indexOf('.');
        String exactFileName = fileName.substring(0, dot);
        String extension = fileName.substring(dot+1, fileName.length());
        //System.out.println("base name = " +exactFileName + " extension = "+extension);
        
        // my answer is that for the string "ayva" the return will be "avya"
        String ayva = "ayva";
        System.out.println(mystery(ayva));
        
        //komut satırından tam sayı n değerini alan ve birim kare üzerinde n rastgele nokta üreten ve en yakın nokta çiftinin mesafesini hesaplayan point2d programı yazınız
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the Vector count:");
        int n = scanner.nextInt();
        Vector2[] vectors = new Vector2[n];
        
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector2(random.nextInt(0, 10), random.nextInt(0, 10));            
        }
        for (int i = 0; i < vectors.length; i++) {
            System.out.println(vectors[i].x + ","+vectors[i].y);
        }
        
        double minDistance = vectors[0].distance(vectors[1]);
        int indexOne=0, indexTwo=0;
        for (int i = 0; i < vectors.length; i++) {
            for (int j = i+1; j < vectors.length; j++) {
                double newDistance = vectors[i].distance(vectors[j]);
                if (newDistance < minDistance) {
                    minDistance = newDistance;
                    indexOne=i;
                    indexTwo=j;
                }
            }
        }
        System.out.println("indexes = " +indexOne + "," + indexTwo + " distance is = " +minDistance);
        
        // not reference type it will print World Hello
        String str1= "Hello";
        String str2 = str1;
        str1 = "World";
        System.out.println(str1);
        System.out.println(str2);
        
        int[] a = new int[10];
        int[] b = new int[10];
        int[] t = new int[10];
        System.out.println("a= " + a + " b= " + b + " t= " + t);
        t=a;
        a=b;
        b=t;
        // Yer değiştirir a ve b yi. Bu işi referansları kopyalayarak yapar. bu nedenle içilerindeli kaydı kopyalamaya gerek yoktur.
        System.out.println("a= " + a + " b= " + b + " t= " + t);                
    }
    
    public static boolean isPalindrome(String s){
        int size = s.length();
        for (int i = 0; i < size/2; i++) {
            if (s.charAt(i)!= s.charAt(size-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    public static String mystery(String s){
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);
        return mystery(b)+mystery(a);
    }
}
