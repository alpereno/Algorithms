package ChapterOne.One;

public class ChapterOnePointOne {    
    public static void main(String[] args) {
        
        // PAGE 21
        
        // Finding the largest of the array elements
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int max = findLargestIndex(array);
        System.out.println("Max Number in Array = " + max);
        
        // Mean of Array
        float mean = findMeanofArray(array);
        System.out.println("Mean value of Array = " + mean);
        
        // copy of an array
        int[] array2 = copyofArray(array);
        System.out.println("Array copied to array2");
        printArray(array2);
        
        // Reverse Array
        int[] reversedArray = reverseNewArray(array);
        System.out.println("reversed");
        printArray(reversedArray);
        
        //--------------------------------------------------------------------------
        // PAGE 23
        
        // math abs.
        int randomValue = -3;
        randomValue = abs(randomValue);
        System.out.println("randomValue's absolute value is = " + randomValue);
        
        // isPrime?
        int isPrimeNumber=14;
        boolean isPrime = isPrime(isPrimeNumber);
        System.out.println("isPrime number is prime = " + isPrime);
        
        
        // N to bit
        
        int value = 15;
        String valuesBinary = toBinaryString(value);
        System.out.println("Value's to Binary = "+value + " -----> " + valuesBinary);
        
        
        int[] a = new int[10];
        // array a becomes 9 8 7 6 5 4 3 2 1 0
        for (int i = 0; i < 10; i++) {
            a[i] = 9-i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        printArray(a);
        
        String x = exR1(6);
        System.out.println(x);
        
        int mys= mystery(3,11);
        System.out.println(mys);
        
        
        
    }
    
    public static int findLargestIndex(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    public static float findMeanofArray(int[] array){
        float sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        float average = sum/n;
        return average;
    }
    
    public static int[] copyofArray(int[] array){
        int n = array.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = array[i];
        }
        return b;
    }
    
    // it will returns new array, does not change parameter
    // you know that arrays are reference type
    public static int[] reverseNewArray(int[] array){
        int n = array.length;
        int[] tempArray = new int [n];
        
        for (int i = 0; i < n; i++) {
            tempArray[i] = array[i];
        }
        
        for (int i = 0; i < n/2; i++) {
            int temp = tempArray[i];
            tempArray[i] = tempArray[n-1-i];
            tempArray[n-1-i] = temp;
        }
        return tempArray;
    }
    
    public static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println("A[" + i + "]" + "= " + array[i]);
        }
    }
    
    public static int abs(int value){
        if (value < 0) return -value;
        else return value;
    }
    
    public static boolean isPrime(int value){
        if (value < 2) 
            return false;
        for (int i = 2; i*i <= value ; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
    
    public static String toBinaryString(int value){
        String result = "";
        for (int i = value; i > 0; i /= 2) {
            result = (i%2) + result;
        }
        return result;
    }
    
    public static String exR1(int n){
        if (n <= 0)  {
            return "";
        }
        return exR1(n-3)+n+exR1(n-2)+n;
    }

    public static int mystery(int a ,int b){
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a+a, b/2);
        }
        return mystery(a+a, b/2)+a;
    }    
}
