package strings;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning string data structure");
        String name = "Anuj";
        System.out.println(name);

        String anotherName = new String("Aman");
        System.out.println(anotherName);

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(2));

        System.out.println(name.equals(anotherName));
        System.out.println(name.isEmpty());

        String s = "anuj";
        String s1 = "kumar";

        String s3 = s + s1;
        System.out.print(s3);

        System.out.println(s.concat(s1));
        System.out.println(s.replace('a', 'b'));

        String cars = "Hydai,maruti,fearrai";

        String all[] = cars.split(",");


        for(String h : all) {
            System.out.print(h);
        }

        System.out.print(s.indexOf('u'));

        System.out.println(s.toLowerCase());
        System.out.print(s.toUpperCase());
        System.out.print(s.trim());

    }
}
