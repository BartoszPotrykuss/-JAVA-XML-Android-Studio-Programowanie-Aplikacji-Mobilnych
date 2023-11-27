// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int kod = 36;
        System.out.println((char)kod);

        String str = "12345";

        double parse = Double.parseDouble(str);
        System.out.println(parse);


        int a = 20;
        String pom0 = " "+a;
        System.out.println(pom0);

        double b = 31.5;
        String pom1 = " "+b;
        System.out.println(pom1);

        double d = 90.7;
        String pom2 = Double.toString(d);
        System.out.println(pom2);

        int i = 10;
        Integer pom = new Integer(i);
        System.out.println(pom);
    }
}