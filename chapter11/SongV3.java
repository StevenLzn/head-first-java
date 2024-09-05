class SongV3 implements Comparable<SongV3> {
  private String title;
  private String artist;
  private int bpm;

  public int compareTo(SongV3 s){
    return title.compareTo(s.getTitle()); // Se reutiliza el compareTo de la clase string para comparar los títulos
  }

  SongV3(String title, String artist, int bpm){
    this.title = title;
    this.artist = artist;
    this.bpm = bpm;
  }

  public String getTitle(){
    return title;
  }

  public String getArtist(){
    return artist;
  }

  public int getBpm(){
    return bpm;
  }

  public String toString(){ // Sobreescribe el método toString de la clase Object y este se llama al imprimir la Lista
    return title;
  }
}