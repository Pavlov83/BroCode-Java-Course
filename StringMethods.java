public class StringMethods {

    public static void main(String[] args){


        String name = "Amazing";

        boolean result = name.equals("Amazing");
        int resultLen = name.length();
        char charAtFour = name.charAt(4);
        int indexOfZ = name.indexOf("z");
        //boolean isEmpty()
        //String toUpperCase
        //String toLowerCase
        //String trim()
        //String replace(oldChar,newChar)

        System.out.println(result + "Is long :" + resultLen + "characters");
        System.out.println("The character on index 4 is:" + charAtFour);
        System.out.println("The index of Z is:" + indexOfZ);

    }
    
}
