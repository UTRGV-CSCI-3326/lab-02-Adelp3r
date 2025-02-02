public class MixMatch {

    public static void main (String[] args){\
        //declaring every variable type
        String varStr = "String";
        char varChar = 'A';
        short varShort = -32768;
        int varInt = 2147483647;
        long varLong = 30000000000L;
        float varFloat = 3.14159f;
        double varDouble = 3.1415926535897932;
        boolean varBoolean = true;

        //printing every data type seperately with a description
        System.out.println(varStr + " <- String, a data type used for storing text.");
        System.out.println(varChar + " <- Char, a data type used to store a SINGLE character or ASCII values.");
        System.out.println(varShort + " <- Short, a data type used to store whole numbers from -32,768 to 32,767");
        System.out.println(varInt + " <- Int, a data type used to store whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(varLong + " <- Long, a data type used to store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(varFloat + " <- Float, a data type used to store fractional numbers. Stores up to 6-7 decimal digits");
        System.out.println(varDouble + " <- Double, a data type used to store fractional numbers. Stores up to 15-16 decimal digits");    
        System.out.println(varBoolean + " <- Boolean, a data type that stores true or false values");

        System.out.println("");
        //multiple variables with a single printout method
        System.out.println(varStr + ", " + varChar + ", " + varShort + ", " + varInt + ", " + varLong + ", " + varFloat + ", " + varDouble + ", and " + varBoolean + ", are examples of the 8 main data types.");
    }   
}