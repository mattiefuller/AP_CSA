
public class Person{ //person class
    double height;
    int age;
    String name;
    String hairColor;

    Person(){
        height = 5.6;
        age = 18;
        name = "Guest";
        hairColor = "blonde";
    }

    Person(double h, int a, String n, String hC){ //person constructors
        height = h;
        age = a;
        name = n;
        hairColor = hC;
    }

}