package Day4.Programs;

public class Detect_Spaces {
    
    public static void main(String[] args) {
        
        String spaces = "  This string contains both double and   triple spaces";
        System.out.println(spaces.indexOf("   "));
        //If output is returned as -1 then there are no double and triple spaces
    }
}
