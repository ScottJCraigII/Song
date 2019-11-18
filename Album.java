/** Scott Craig
 * Iterator Design Pattern Project
 * CSCE 247 Portia Plante
 * 18 1200 Nov2019
 *
 * This project utilizes the iterator design pattern to implement the algorithm to build an album
 * It takes nothing in from the user and utilizes an instructor supplied driver
 * The UML was followed
 * I chose to offset the iterator to -1 to simplify the next() function to reduce the number of songs
 * being created.
 */

public class Album {
    /**
     * I must hard code in the max array size of 20
     * because matching the UML prevents adding a new FINAL variable MAXSONGS
     * which the requirements document specifies
     */
    private Song[] song =new Song[20];
    private int count;
    private String name;

    Album(String name) {
        this.name = name;
    }

    public void addSong(String name, String artist, double length, String genre) {

        /**
         * Prevent main function from building albums that are too large.
         */

        try {
            song[count] = new Song(name, artist, length, genre);
            count++;
        }catch (Exception e){
                System.out.println("Album has reached its Maximum number of songs");
        }
    }

    public AlbumIterator createIterator(){
        return new AlbumIterator((song));
    }

}
