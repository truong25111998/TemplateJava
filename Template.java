package template;


public class Template {
    private String name;
    private String artist;

    public void inTT(){
        System.out.println("name is: "+ name);
        System.out.println("artist is: "+ artist);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
      
}
