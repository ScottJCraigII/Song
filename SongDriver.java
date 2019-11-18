import java.util.Iterator;
public class SongDriver {
    public static void main(String[] args) {
        Album myHits = new Album("Surfer Girl");
        myHits.addSong("Surfer Girl", "The Beach Boys", 2.26, "pop");
        myHits.addSong("Catch a Wave", "The Beach Boys", 2.07, "pop");
        myHits.addSong("The Surfer Moon", "The Beach Boys", 2.11, "pop");
        myHits.addSong("South Bay Surfer", "The Beach Boys", 1.45, "pop");
        myHits.addSong("The Rocking Surfer", "The Beach Boys", 2, "pop");
        myHits.addSong("Little Deuce Coupe", "The Beach Boys", 1.38, "pop");
        myHits.addSong("In My Rooom", "The Beach Boys", 2.11, "pop");
        myHits.addSong("Hawaii", "The Beach Boys", 1.59, "pop");
        myHits.addSong("Surfers Rule", "The Beach Boys", 1.54, "pop");
        myHits.addSong("Our Car Club", "The Beach Boys", 2.22, "pop");
        myHits.addSong("Your Summer Dream", "The Beach Boys", 2.27, "pop");
        myHits.addSong("Boogie Woodie", "The Beach Boys", 1.56, "pop");

        AlbumIterator songIterator = myHits.createIterator();

        System.out.println("Song List:");

        while(songIterator.hasNext()) {
            Song song = songIterator.next();
            song.print();
        }
    }
}
