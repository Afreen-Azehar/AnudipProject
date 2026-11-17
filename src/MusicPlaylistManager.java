import java.util.*;
public class MusicPlaylistManager{
    public static void main(String[] args)
    {
        LinkedList<Object> music=new LinkedList<>();
        //1 Adding a new song
        music.add("Ophelia");
        music.add("DOJA CAT");
        music.add("HIM AND I");
        music.add("BLANKSPACE");

        System.out.println("The playlist:::");

        for( Object x:music)
        {
            System.out.println(x);
        }



        //2 Adding a song At the beginning
        music.addFirst("bisarah");

        //3 Adding the song at the end
        music.addLast("gharshana");

        System.out.println("The updated playlist:::");

        for( Object x:music)
        {
            System.out.println(x);
        }


        //4 Displaying the first song
        System.out.println("The First Song From your playlist is:::"+music.getFirst());

        //5 Displaying the last song
        System.out.println("The LAst Song From your playlist is:::"+music.getLast());


       // System.out.println("The song i love :::"+music.get(1));
        //System.out.println("The First Song From your playlist is:::"+music.getClass());


        //6...removing the First song from the playlist
       music.removeFirst();

       //7...removing the last song from the playlist
       music.removeLast();

        System.out.println("The playlist modified as:::");

        for( Object x:music)
        {
            System.out.println(x);
        }

       ///8....searching for a song ophelia
       System.out.println("The Song search result:::"+music.contains("Ophelia")); ;




        //9......updating a song
        music.set(1,"pushpa");
        System.out.println("The song 1 is updated");


        //10.....display All the songs
        System.out.println("The Final playlist:::" );
        for( Object x:music)
        {
            System.out.println(x);

        }

        //11....Display the number of Songs in the play list
       System.out.println("The Total songs present in the Play list are::"+music.size()); ;







    }
}