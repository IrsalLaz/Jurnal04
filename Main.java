import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Song>  playList = new LinkedList<Song>();
        Scanner in = new Scanner(System.in);
        String penyanyi, judul;
        
        //test data
        playList.add(new Song("balonku", "bapakmu"));
        playList.addLast(new Song("monster", "imagine dragon"));
        playList.add(new Song("SHINDEE", "takayan"));
        playList.addFirst(new Song("toy", "takayan"));

        System.out.println( "====================SONG PLAYLIST====================");
        System.out.println("1. Play \n2. Input song \n3. Delete Song");
        int choice = in.nextInt();
        //Method playlist

        ListIterator<Song> iterator = playList.listIterator();
        if (choice == 1) {
            System.out.println("Kamu lebih suka mana?\n1. Berurut\n2. Mundur");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("========Berurut========");
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
            else if(choice == 2){
                System.out.println("========Mundur========");
                while (iterator.hasPrevious()){
                    System.out.println(iterator.previous());
                }
            }
            else{
                System.out.println("Pilihanmu nggak ada :(");
            }
        }
        else if (choice == 2) {
            System.out.println("Judul:");
            judul = in.nextLine();
            System.out.println("Penyanyi:");
            penyanyi = in.nextLine();

            Song lagu = (new Song(judul, penyanyi));
            playList.add(lagu);
        }
        else if(choice == 3){
            System.out.println("Lagu terakhir?\n 1.ya\n2. bukan");
            choice = in.nextInt();
            if (choice == 1) {
                playList.remove();               
            }
            else if(choice == 2){
                System.out.println("Masukan Judul lagu");
                judul = in.nextLine();
                
                while (iterator.hasNext()) {
                    Song ob = iterator.next();
                    if (ob.getJudul().equals(judul)) {
                        iterator.remove();
                    }
                }
            }
            else{
                System.out.println("Pilihanmu nggak ada :(");
            }
        }
    }
}
