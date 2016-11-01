package myPackage;

/**
 * Created by Ruslan_Zdor on 10/24/2016.
 */
public class Parent extends AbstractMan{

    private String name;

    public Parent() {
        name = "init";
    }

    public Parent(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
