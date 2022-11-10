package StringAnalysis;

import java.util.List;

/**
 *  Stores Basic operations with strings
 */
public class Challenge1 {

    /**
     * generates a string of random numbers of length 10 which satisfies the condition of
     * changing it´s 2 initial digits depending on the given parameter
     * @param stringType changes the initial digits of the generated string to:
     *                   ¨54¨ if ¨Tipo A¨ is given.
     *                   ¨08¨ if ¨Tipo B¨ is given.
     *                   Invalid String Type exeption otherwise.
     * @return a generated random string of length 10
     */
    public String randomString(String stringType) throws Exception {
        String returnString;
        if (stringType == "Tipo A"){
            returnString = "54";
        } else if (stringType == "Tipo B"){
            returnString = "08";
        } else {
            throw new Exception("Invalid String Type");
        }
        int rest= (int)(Math.random()*100000000);
        returnString = returnString+rest;
        return returnString;
    }

    /**
     * verifies if a String is not contained in a list of String
     * @param stringList the list we want to verify
     * @param search the String we want to search in the list
     * @return true if the list does not contain the String, false otherwise
     */
    public boolean isNotInList (List<String> stringList,String search){
        if (stringList.contains(search)){
            return false;
        } else{
            return true;
        }
    }
}
