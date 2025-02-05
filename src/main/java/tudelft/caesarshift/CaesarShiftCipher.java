package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        //initialize spring builder
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26; //shifting with the alphabet range

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
           // sb.append(currentChar);

            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }
            //shift formula
            char shiftedChar =(char)(currentChar + shift);

            //start alphabet over
            if (shiftedChar > 'z') {
                shiftedChar = (char) (shiftedChar - 26);
            } else if (shiftedChar < 'a'){
                shiftedChar = (char) (shiftedChar + 26);
            }
            sb.append(shiftedChar);
        }

        return sb.toString();
    }
}
