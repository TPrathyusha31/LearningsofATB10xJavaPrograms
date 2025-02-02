package ex_09_Task_1st_Feb_2025;

import java.util.Scanner;

public class Lab040_typeOf_Website {
    public static void main(String[] args) {
//        take the Site URL input from the user
//
//        Example Scenarios
//        Input: example.com
//        Output: The website type is: Commercial website
//        Input: example.org
//        Output: The website type is: Non-profit organization
//        Input: example.edu
//        Output: The website type is: Educational institution
//        Input: example.gov
//        Output: The website type is: Government website
//        Input: example.net
//        Output: The website type is: Network-related website
//        Input: example.info
//        Output: The website type is: Informational website
//        Input: example.xyz
//        Output: The website type is: Unknown or other types of websites
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website URL : ");
        String website_url = sc.nextLine().toLowerCase();
        if (website_url.endsWith(".xyz")){
            System.out.println("The website type is: Unknown or other types of websites");
        } else if(website_url.endsWith(".com/")){
            System.out.println("The website type is: Commercial website");
        } else if (website_url.endsWith(".org/")){
            System.out.println("The website type is: Non-profit organization");
        }else if (website_url.endsWith(".edu/")){
            System.out.println("The website type is: Educational institution");
        }else if (website_url.endsWith(".gov/")){
            System.out.println("The website type is: Government website");
        }else if (website_url.endsWith(".net/")){
            System.out.println("The website type is: Network-related website");
        }else if (website_url.endsWith(".info/")){
            System.out.println("The website type is: Informational website");
        }else{
            System.out.println("Please enter the correct format of url info");
        }
        sc.close();


    }
}