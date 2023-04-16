package stringsManipulation;

public class StringMain {

    public static void main(String args[]) {
        System.out.println("learning string manipulation");
        String name = "Anuj";
        System.out.println("The name is " + name);
        String anotherName = new String("Anuj");
        System.out.println("the another name is " + anotherName);

        System.out.println(name.equals(anotherName));

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(0));
        System.out.println(name.substring(1, 3));
        System.out.println(name.concat("nui"));
        System.out.println(name.contains("nu"));
        System.out.println(name.isEmpty());
        System.out.println(name.replace('A', 'a'));
        String cars = "Hyndai, maruti, denmark";
        String carArray[] = cars.split(",");
        for (String c : carArray) {
            System.out.println(c);
        }

        System.out.println(name.trim());


    }
}
