public class LabTask41 {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 15;
        z = 20;
//expression 1
        System.out.println("!(x > 10): " + !(x > 10));
//expression 2
        System.out.println("x <= 5 || y < 15 : " + (x <= 5 || y < 15));
//expression 3
        System.out.println("(x != 5 ) && (y != z): " + ((x != 5) && (y != z)));
//expression 4
        System.out.println("x >= z || (x + y >= z): " + (x >= z || (x + y >= z)));
//expression 5
        System.out.println("(x <= y - 2) && (y >= z) || (z - 2 != 20): " + ((x <= y - 2) && (y >= z) || (z - 2 != 20)));
    }
}