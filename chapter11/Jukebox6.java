import java.util.*;

public class Jukebox6 {
  public static void main(String[] args){
    new Jukebox6().go();
  }

  public void go(){
    List<SongV3> songList = MockSongs.getSongsV3();
    System.out.println(songList);

    // ordenamiento implementado con lambdas
    // con lambdas no es necesario una clase para implementar el método. El compilador ya sabe que sort recibe un objeto que implementa Comparator con un solo método
    // El compilador infiere la clase y el método, recibiendo el lambda con esta estructura
    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songList);

    songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
    System.out.println(songList);

    // sharpen your pencil
    // sort by BPM
    songList.sort((one, two) -> one.getBpm() - two.getBpm());
    System.out.println(songList);

    // sort by title in descending order
    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()) * -1);
    System.out.println(songList);
  }
}