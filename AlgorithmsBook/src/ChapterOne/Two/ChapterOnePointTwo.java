package ChapterOne.Two;
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
    
}
