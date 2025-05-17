public class StringComp {
    public static void main(String[] args) {
        String firstName1 = new String("Parth");
        String firstName2 = new String("Parth");

        System.out.println("== Comparison (Shallow) on String Objects: " + (firstName1 == firstName2));
        System.out.println("equals() Comparison (Deep) on String Objects: " + firstName1.equals(firstName2));

        String lastName1 = "Gaikwad";
        String lastName2 = "Gaikwad";

        System.out.println("== Comparison (Shallow) on String Literals: " + (lastName1 == lastName2));
        System.out.println("equals() Comparison (Deep) on String Literals: " + lastName1.equals(lastName2));
    }
}
