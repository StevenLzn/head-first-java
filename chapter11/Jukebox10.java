import java.util.*;

public class Jukebox10 {
  public static void main(String[] args){
    new Jukebox10().go();
  }

  public void go(){
    List<SongV4> songList = MockMoreSongs.getSongsV4();
    System.out.println(songList);

    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songList);

    Set<SongV4> songSet = new TreeSet<>(songList);
    System.out.println(songSet);
  }
}