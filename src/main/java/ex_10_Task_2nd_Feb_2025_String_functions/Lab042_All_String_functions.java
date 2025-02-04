package ex_10_Task_2nd_Feb_2025_String_functions;

public class Lab042_All_String_functions {
    public static void main(String[] args) {
        String s = "Sonam";
        // 1.Length --> gives the length of string
        System.out.println("Length of String : "+ s.length());

        //2.CharAt() --> it returns the char value at specified location (generally location/index  starts from 0)
        System.out.println(s.charAt(3));
        //System.out.println(s.charAt(8)); ---> It throws StringIndexOutOfBoundsException as the specified index is not present

        //3.concat() --> concatenates specified string to the end of this string
        System.out.println(s.concat("Kapoor"));
        String s1 = "Gupta";
        System.out.println(s.concat(s1));

        //4.contains() --> returns true only if the string contains specific sequence of characters
        System.out.println(s.contains("am")); //true as s= Sonam and am sequence is present in it
        System.out.println(s.contains("oo")); //false as s is still Sonam not SonamKapoor as after concatetaion we didn't store it in any variable.As we know string will not modify the existing s rather creates new one

       //5.equala() --> used to compare values of two string with acse sensitiveness( whereas '==' is used to compare the locations of strings.
        System.out.println(s.equals(s1));
        String s2="Sonam";
        System.out.println(s.equals(s2));

        //6.equalsIgnoreCase() --> compare values of two strings ignoring case sensitiveness
        String s3="soNaM";
        System.out.println(s.equalsIgnoreCase(s3));

        //7.indexOf() --> returns index within the string of first occurence of the specified substring.
        String s4 = "Sonam Kapoor";
        System.out.println(s4.indexOf("a"));

        //8.replace() --> returns string resulting from replacing all occurences of old characters with new characters
        System.out.println(s4.replace('K','k'));
        System.out.println(s4.replace("Kapoor","KAPOOR"));

        //9.split() --> based on condition we can split the string no of two parts.
        String[] split =  s4.split("a");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        String[] split1 = s4.split(" ");
        System.out.println(split1[0]);

        //10.substring() --> extracts a portion of string( if n is the length then it goes upto n-1)
        String a = "Niagara. o roar again!";
        System.out.println(a.substring(11,15));    // it will start from 11 i.e r and end at 14 i.e r // output: roar

        //11. toLowerCase()
        String Lcase = "SOWJANYA";
        System.out.println(Lcase.toLowerCase());

        //12.UpperCase()
        String Ucase  = "sowjanya";
        System.out.println(Lcase.toUpperCase());

        //13.startswith() --> tests if the string basically starts with specified prefix
        System.out.println(a.startsWith("Ni"));

        //14.endswith() --> tests if the string basically ends with specified character suffix
        System.out.println(a.endsWith("!"));

        //15.trim() --> It removes all the leading and trailing spaces ( removes spaces before and after the string)
        String b = "  Yes you can quiz me     ";
        System.out.println(b.trim());

        //16.CompareTo() --> It compares two strings if they are lexographically equal or not(lexographically mean based on ASCII value)
        //An int value: 0 if the string is equal to the other string.
        //< 0 if the string is lexicographically less than the other string
        //> 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println(a.compareTo(b));
        System.out.println(s.compareTo(s2));
        System.out.println(s2.compareTo(s4));


        //17.CompareToIgnoreCase() ---> It compares two strings if they are lexographically equal or not ignoring case sensitivity
        System.out.println(s3.compareToIgnoreCase(s2));

    }
}
