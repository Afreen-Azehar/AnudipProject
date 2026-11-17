import java.util.*;
public class StudentRankingSystemTreeSet {
    public static void main(String[] args)
    {
        TreeSet<Integer> scores=new TreeSet<>();
        scores.add(85);
        scores.add(92);
        scores.add(76);
        scores.add(95);
        scores.add(88);
        scores.add(92);
        scores.add(76);
        scores.add(100);
        System.out.println("The Scores");
        for(Integer marks:scores)
            System.out.println(marks);

        System.out.println("The Lowest Score is"+scores.first());
        System.out.println("The Highest Score is"+scores.last());
        System.out.println("Checking if anyone has scored 92");
        if(scores.contains(92))
            System.out.println("Score Exist");
        else
        {
            System.out.println("Score doesnt Exist");
        }


        System.out.println("\n"+"Removing The score 76");
        if (scores.remove(76))
        {
            System.out.println("removed Score 76");
        }
        else {
            System.out.println("76 Score not recored so cant remove");
        }

        System.out.println("Displaying The Scores available Scores");

        for(Integer marks:scores)
            System.out.println(marks);




    }
}
