import myInterface.Baby;
import myInterface.Dog;
import myInterface.IVoice;

/**
 * Created by Ruslan_Zdor on 10/24/2016.
 */
public class InterfaceExample {

    public static void main(String[] str) {
        IVoice dog = new Dog();
        IVoice baby = new Baby();

        callVoice(dog);
        callVoice(baby);
    }

    public static void callVoice(IVoice object) {
        object.getVoice();
    }
}
