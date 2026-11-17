import java.util.*;
public class LinkedHashSetCollegePortal {
    public static void main(String[] args)
    {
        LinkedHashSet<String> clgPortal= new LinkedHashSet<>();
        clgPortal.add("Java");
        clgPortal.add("oracle");
        clgPortal.add("excel");
        clgPortal.add("backend java");
        clgPortal.add("networking");
        clgPortal.add("power Bi");
        clgPortal.add("python");
        clgPortal.add("tabula");
        clgPortal.add("peoplesoft");
        clgPortal.add(".net");


        System.out.println("The unique courses searched (in order)");
        for(String course:clgPortal)
            System.out.println(course);

        String searchCourse= "HTML";
        if(clgPortal.contains(searchCourse))
            System.out.println("\n"+searchCourse+" course do exist");
        else {
            System.out.println("\n" + searchCourse + " course do not exist");
        }

        clgPortal.remove("java");

    }
}
