package id.kawahedukasi;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        //email
        String emailPattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        Pattern patternEmail = Pattern.compile(emailPattern);
        String inputEmail = "myemail@gmail.com";
        Matcher matcherEmail = patternEmail.matcher(inputEmail);

        //Name
        String NamePattern = "^[a-zA-Z][a-zA-Z\\s]{0,20}[a-zA-Z]$";
        Pattern patternName = Pattern.compile(NamePattern);
        String inputName = "Anas Fatur Rahman";
        Matcher matcherName = patternName.matcher(inputName);

        //Kode Pos
        String postPattern = "^\\d{5}(?:[-\\s]\\d{4})?$";
        Pattern patternPost = Pattern.compile(postPattern);
        String inputPost = "32152";
        Matcher matcherPost = patternPost.matcher(inputPost);

        //dateOne = dd-MM-yyyy
        String dateOnePattern = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Pattern patternDateOne = Pattern.compile(dateOnePattern);
        String inputDateOne = "23-11-1999";
        Matcher matcherDateOne = patternDateOne.matcher(inputDateOne);

        //dateTwo = dddd, MMMM yy
        String dateTwoPattern = "^(?:(?:Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (?:January|February|March|April|May|June|July|August|September|October|November|December) \\d{2})$";
        Pattern patternDateTwo = Pattern.compile(dateTwoPattern);
        String inputDateTwo = "Tuesday, February 20";
        Matcher matcherDateTwo = patternDateTwo.matcher(inputDateTwo);

        //Ip address
        String ipPattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern patternIP = Pattern.compile(ipPattern);
        String inputIP = "192.168.1.0";
        Matcher matcherIP = patternIP.matcher(inputIP);

        System.out.println("Pattern email "+inputEmail+" bernilai "+matcherEmail.find());
        System.out.println("Pattern Name "+inputName+" bernilai "+matcherName.find());
        System.out.println("Pattern Post Code "+inputPost+" bernilai "+matcherPost.find());
        System.out.println("Pattern date (dd-MM-yyyy) "+inputDateOne+" bernilai "+matcherDateOne.find());
        System.out.println("Pattern date (dddd, MMMM yy) "+inputDateTwo+" bernilai "+matcherDateTwo.find());
        System.out.println("Pattern IP Address "+inputIP+" bernilai "+matcherIP.find());

    }
}
