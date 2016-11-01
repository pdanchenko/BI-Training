import myPackage.AbstractMan;
import myPackage.Child;
import myPackage.Parent;

/**
 * Created by Ruslan_Zdor on 10/24/2016.
 */
public class ParentChildExample {
    public static void main(String[] str) {
        Parent parent = new Parent();
        parent.setAge(40);

        System.out.println(parent.getName());
        parent.setName("name");
        System.out.println(parent.getName() + parent.getAge());

        parent = new Parent("str");
        System.out.println(parent.getName() + parent.getAge());

        Child child = new Child();
        child.setName("child");
        child.setAge(15);
        child.setName("child name" + parent.getAge());
        System.out.println(child.getName() + child.getAge());

      //  AbstractMan man = new AbstractMan();
    }
}
