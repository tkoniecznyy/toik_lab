package com.tkonieczny;


public class AtBashCipher implements Cipher{

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();





    @Override
    public String decode(String message) {
        message = message.toLowerCase();
        StringBuilder returnMessage = new StringBuilder();

        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==(' ')){
                returnMessage.append(' ');
            }
            for(int j=0;j<alphabet.length;j++){
                if(message.charAt(i)==alphabet[j]){
                    returnMessage.append(alphabet[(alphabet.length-1)-j]);
                }
            }
        }
        return returnMessage.toString();
    }

    @Override
    public String encode(String message) {
        return decode(message);
    }
}
