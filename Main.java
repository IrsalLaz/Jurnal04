import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Song>  playList = new LinkedList<Song>();

        playList.add(new Song("balonku", "bapakmu"));
        playList.addLast(new Song("monster", "imagine dragon"));
        playList.add(new Song("SHINDEE", "takayan"));
        playList.addFirst(new Song("toy", "takayan"));

        //Method playlist
        ListIterator<Song> iterator = playList.listIterator();
        
        System.out.println("print berurut");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Print mundur");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        
        playList.remove();
        System.out.println("Sesudah hapus lagu");
        for (Song song : playList) {
            System.out.println(song);
        }
        

    }
}
