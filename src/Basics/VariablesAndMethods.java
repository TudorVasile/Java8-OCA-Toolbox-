package Basics;

/*
 *This Class aims to demonstrate the variations of data types and their differences.
 * Methods are used to outline their different types and styles.
 */
public class VariablesAndMethods {

    //These primitives are an example of Class variables/member variables. Sorted by their size from largest to smallest.

    boolean bool = false;
    byte variable0 = 127;
    short variable1;
    char variable2 = 23;
    int variable3 = variable0;
    float variable4 = 13.3f;
    double variable5;
    long variable6 = 324_234_223;

    //* note that data types should be considered like buckets where the smaller variable can be assigned to a larger one.
    //The inverse could also happen but casting is needed and information would be lost. Without a cast the compiler will complain.
    //For this exam you would need to know the naming conventions of variables. The only symbols which can be used are $ and _.
    //Variable names cannot begin with a number.
    //Variables can be given access identifiers such as public, private or just as the above shown default value.

    //Here are some wrapper classes of Data types:
    Byte myBype = 3;
    Short myShort = new Short(myBype);
    Character myCharacter = 23;
    Integer myInteger = new Integer(44556);
    Float myFloat = myInteger.floatValue();
    Double myDouble = new Double(23.1);
    Long myLong = myFloat.longValue();

    //Notice how wrapper classes use Capital letters to denote their difference between primitives but that is not all as
    //wrapper classes can also invoke their own methods since they are considered to be objects.
    //For the exam you will need to know some of the methods wrapper classes can invoke and the uses of wrapper classes.
    //Wrapper classes are considered to be Objects and reside in memory.

    //Other objects include
    String myString = "Hello World";
    Object myObject = myString;
    int integerCollection [] = new int[3];


    //Objects contain methods that can be invoked.
    String anotherVariable = this.toString();

    //Methods and their signatures

    public void myMethod(){ // this method returns nothing

    }

    String anotherMethod(){ // a String is an object so returns null
        return null;
    }

    static public int yetAnotherMethod(String stringparam){ // this method does not belong to the object but all all instances of a class.
        return 3;
    }

    //The main method where this is the entry point to our program
    public static void main(String[] args){

    }
}
