public class AlbumIterator implements Iterator {
    private Song[] song;

    /**
     * Position starts at -1 so I can simplify the next function, It allows me to use less memory
     * by not having to make a new temporary song object before iterating and
     * returning that temporary object.
     */

    private int position=-1;

    AlbumIterator (Song[] songs){
        this.song =songs;
    }

    @Override
    /**
     * If position +1 is outside of the bounds of the array or the array list doesn't contain a song
     */
    public boolean hasNext() {
        if (position+1 >= song.length || song[position+1] == null){
            return false;
        } else{
            return true;
        }
    }

    public Song next(){
        position = position+1;
        return song[position];
    }
}
