public class Song {
    private String judul;
    private String penyanyi;

    public Song(String judul, String penyanyi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
    }
    public String getJudul(){
        return judul;
    }
    @Override
    public String toString(){
        return  "\nJudul    : " + judul +
                "\nPenyanyi : "+ penyanyi;
    }
}