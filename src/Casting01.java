public class Casting01 {
    public static void main(String[] args) {

        //Declare and initialize a byte with a value of 128
        //byte myAByte = 128;
        //Observe NetBeans' complaint

        
        //Declare and initialize a short with a value of 128
        short myBShort = 128;

        //Create a print statement that casts this short to a byte
        byte casted = (byte) myBShort;
        System.out.println("Casted btye from short" + casted);


        //Declare and initialize a byte with a value of 127

        byte myC = 127;
        //Add 1 to this variable and print it
        System.out.println(myC + 1);
        //Add 1 to this variable again and print it again
        System.out.println(myC + 1);


    }    
}
