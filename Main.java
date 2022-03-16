import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Song>  playList = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        String judul, penyanyi;
        int choice, subChoice;
        boolean isContinue = true;
        
        
        //test data
        playList.add(new Song("balonku", "bapakmu"));
        playList.add(new Song("SHINDEE", "takayan"));
        playList.addFirst(new Song("Dattebayo", "naruto"));

        while (isContinue) {

            System.out.println( "====================SONG PLAYLIST====================");
            System.out.println("1. Tambah lagu \n2. Hapus lagu \n3. Mainkan");
            choice = in.nextInt();
            
            if (choice == 1) {
                System.out.print("Judul:");
                judul = in.nextLine();
                System.out.print("Penyanyi: ");
                penyanyi = in.nextLine();
                
                Song e =(new Song(judul, penyanyi));
                playList.add(e);
            }
            
            else if(choice == 2){
                System.out.println("Lagu pertama?\n1. ya\n2. bukan");
                subChoice = in.nextInt();
                if (subChoice == 1) {
                    playList.remove();               
                }
                else if(subChoice == 2){
                    System.out.print("Judul :");
                    in.nextLine();
                    judul = in.nextLine();

                    ListIterator<Song> iteran = playList.listIterator();
                    while (iteran.hasNext()) {
                        Song ob = iteran.next();
                        if (ob.getJudul().equals(judul)) {
                            iteran.remove();
                        }
                    }
                }
                else{
                    System.out.println("Pilihanmu nggak ada :(");
                }
                System.out.println("Lagu berhasil dihapus!");
            }

            else if (choice == 3) {
                
                System.out.println("Kamu lebih suka mana?\n1. Berurut\n2. Mundur");
                choice = in.nextInt();
                if (choice == 1) {
                    ListIterator<Song> iterator = playList.listIterator();
                    System.out.println("========Berurut========");
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                }
                else if(choice == 2){
                    ListIterator<Song> it = playList.listIterator(playList.size());
                    System.out.println("========Mundur========");
                    while (it.hasPrevious()){
                        System.out.println(it.previous());
                    }
                }
                else{
                    System.out.println("Pilihanmu nggak ada :(");
                }
            }

            System.out.println("Mau lanjut?\n(y/n)");
            String yesOrNo = in.next();
            if (yesOrNo.equals("y") ) {
                isContinue = true;
            }
            else if(yesOrNo.equals("n")){
                isContinue = false;
            }
            //need else for mismatch input
        }

        in.close();
    }
    //perhaps need new meth for looping conf
    
}
