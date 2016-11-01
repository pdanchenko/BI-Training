/**
 * Created by Ruslan_Zdor on 10/24/2016.
 */
public class Example {

    public static void main (String[] str) {

        String first = str[0];
        String second = str[1];

        System.out.println("first is " + first);
        System.out.println("second is " + second);
        System.out.println("a == first is " + ("a"==first));
        System.out.println("second == first is " + (second==first));

        System.out.println("second equals first is " + (second.equals(first)));
    }
}

