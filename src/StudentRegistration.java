import java.util.*;
public class StudentRegistration {
    public static void main(String[] args)
    {
        //1...Creating the HashSet to Insert the Students
        HashSet<String> students=new HashSet<>();

        //2...Adding Students to the Hashset
        students.add("Afreen");
        students.add("Srividhya");
        students.add("venella");
        students.add("Arifa");
        students.add("Pavan");

        //3.Displaying The Students Those Are registered in the Fest
        System.out.println("The Students Registered in Fest are------");
        System.out.println("-------------------------------------------");

        //4.Using The For each loop
        for(String s:students)
        {
            System.out.println(s);
        }


        //5...Trying To Add Some Students Those who Were Already registered

        students.add("Afreen");
        students.add("Pavan");


        //.Displaying The Students Those Are registered in the Fest
        System.out.println("The Students After duplication Registered in Fest are------");
        System.out.println("-------------------------------------------");
        //.Using The For each loop
        for(String s:students)
        {
            System.out.println(s);
        }


        //6.....Checking if a student present or not
        if(students.contains("Pavan"))
            System.out.println("Pavan is Registered");
        else
        {System.out.println("Pavan is Not Redistered");
        }

        //7.....Removing Pavan From The Registration
        students.remove("Pavan");
        System.out.println("Pavan is removed From the Fest Registration");

        //8....Displaying the total number of Students Registered
        System.out.println(students.size());



        //.Displaying The Students Those Are registered in the Fest
        System.out.println("The Students Final Registration List------");
        System.out.println("-------------------------------------------");
        //.Using The For each loop
        for(String s:students)
        {
            System.out.println(s);
        }

        //students.clear();

        //....checking if the hashset is empty or not

        if(students.isEmpty())
            System.out.println("The HashSet is empty");
        else
            System.out.println("The HashSet is not Empty");







    }

}
