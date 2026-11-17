/*
    import java.util.*;

    public class Test {

        public static void main(String[] args) {

            boolean bool [] = new boolean[5];

            Set s = new TreeSet();

            bool[0] = s.add(10);

            bool[1] = s.add(new Integer(22));

            bool[2] = s.add("b");

            bool[3] = s.add("a");

            for(int i = 0; i<bool.length;i++)

                System.out.print(bool[i] +"");

        }

    }

 */
/*
import java.util.*;

public class Test implements Comparable<Integer> {

    public static void main(String[] args) {

        int [ ] arr = {1, 2, 3, 4};

        PriorityQueue <Integer> pq = new PriorityQueue<Integer>();

        for(int x :arr)

            pq.offer(x);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq.size());

    }

}


import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;

        int rev=0;
        while(x!=0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        if(temp==rev)
        {
            System.out.println("Is a palindrome Number ");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }

    }
}

 */


import java.util.LinkedHashSet;
import java.util.Scanner;

class Remove_duplicate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an array::");
        int size=sc.nextInt();
        System.out.println("Enter the elements of array");


        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(sc.nextInt());
        }

        for (int x : set) {
            System.out.println(x);
        }
    }
}