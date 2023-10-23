package SameElements;
import java.util.Arrays;

public class SameElements {
    public static void main(String[] args) {
        String[] a = new String[]{"java", "test", "university"};
        String[] b = new String[]{"car", "university", "plane"};

        for(int i=0; i<a.length ;i++) {
            for(int j=0; j<b.length; j++) {
                if(a[i] == b[j])
                    System.out.println("a: " + a[i] + " b: " + b[j]);
            }
        }
    }
}
