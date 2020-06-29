import java.util.List;

public class specisic_value {
    public static void main(String[] args) {
        int[] num = {10, 25, 23, 54, 85};
        int toFind = 85;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found in array.");
        else
            System.out.println(toFind + " is not found in array.");
    }
}














