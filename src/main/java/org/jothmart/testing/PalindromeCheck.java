package org.jothmart.testing;

public class PalindromeCheck {

    public boolean isPalindrome(String str){
       /* if(str.isEmpty())
            return true;*/
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse))
            return true;
            /*for(int i=0;i<str.length();i++){

            }*/
        return false;
    }

}
