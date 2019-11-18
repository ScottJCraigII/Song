public class Song {
    private String name;
    private String artist;
    private double length;
    private String genre;

    public Song(String name, String artist, double length, String genre){
        this.name = name;
        this.artist =artist;
        this.length = length;
        this.genre=genre;
    }

    public void print(){
        System.out.println(name+" by "+artist+" category: "+genre+" length: "+length);
    }

}
