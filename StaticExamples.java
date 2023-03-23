// Static can be class, methods, variables.
// Static methods are those methods whose access does not depend on the object i.e. no need of object creation to access them.
// If objects are created then statically declared variables is common to all the objects.
public class StaticExamples {
    public static void main(String[] args) {
        System.out.println(Human.population); // accessing without objects creation // outputs 0
    }
    class Human{
        static long population;
    }
}
