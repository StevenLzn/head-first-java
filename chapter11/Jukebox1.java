import java.util.*;

public class Jukebox1 {
  public static void main(String[] args){
    new Jukebox1().go();
  }

  public void go(){
    List<String> songList = MockSongs.getSongStrings();
    System.out.println(songList);
    Collections.sort(songList); // Usa ordenamiento "natural" primero caracteres especiales, luego números, luego mayúsculas y luego minúsculas(todo bajo estandar unicode)
    System.out.println(songList);
  }
}