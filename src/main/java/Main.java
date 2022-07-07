public class Main {
    public static void main(String[] args) {

        //----------------GENERIC METHODS EXAMPLE------------------

        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"B","Y","E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println("---------------------------------");

        displayArrayGeneric(intArray);
        displayArrayGeneric(doubleArray);
        displayArrayGeneric(charArray);
        displayArrayGeneric(stringArray);

        System.out.println("---------------------------------");

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

        //----------------GENERIC CLASS EXAMPLE-------------------
        System.out.println("---------GENERIC CLASS EXAMPLE------------");

        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('$');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        System.out.println("-----------now with one generic class-----------");

        MyGenericClass <Integer> myIntGeneric = new MyGenericClass<>(2);
        MyGenericClass <Double> myDoubleGeneric = new MyGenericClass<>(6.14);
        MyGenericClass <Character> myCharGeneric = new MyGenericClass<>('#');
        MyGenericClass <String> myStringGeneric = new MyGenericClass<>("World");

        System.out.println(myIntGeneric.getValue());
        System.out.println(myDoubleGeneric.getValue());
        System.out.println(myCharGeneric.getValue());
        System.out.println(myStringGeneric.getValue());


    }

    public static void displayArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x+" ");
            
        }
        System.out.println();
    }

    public static void displayArray(Double[] array) {
        for (Double x : array) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static void displayArray(Character[] array) {
        for (Character x : array) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static void displayArray(String[] array) {
        for (String x : array) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static <Thing> void displayArrayGeneric(Thing[] array) {
        for (Thing x : array) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static <Thing> Thing getFirst (Thing[] array) {

        return array[0];
    }
}
