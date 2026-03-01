import java.util.ArrayList;
import java.util.HashSet;

public class FindSubstringWithCondition {

    public static void main(String[] args) {

    }

    public String[] findSubstring(String s, int minLength, int maxLength,int maxUnique) {

        if(s.length()<minLength){
            System.out.println("Invalid String");
            return null;
        }
        int i = 0, j = 0;
       HashSet<Character> set = new HashSet<>();
       ArrayList<String> list = new ArrayList<>();
       StringBuilder sb = new StringBuilder();
       return null;
    }

}
