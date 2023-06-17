public class VideoTape {
    private String title;
    private int length;
    private String available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public VideoTape(String title, int length, String available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }
    public void show()
    {
        System.out.println(title+" "+length+" "+available);
    }
}
class Movie extends VideoTape
{
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;
    Movie(String title,int length,String available,String rating)
    {
        super(title, length, available);
        this.rating=rating;
    }
    public void show()
    {
        System.out.println(rating);
    }

}
class MusicVideo extends Movie
{
    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    private String music;

    public MusicVideo(String title, int length, String available, String rating, String music) {
        super(title, length, available, rating);
        this.music = music;
    }
    public void show()
    {
        System.out.println(music);
    }

}
 class M
{
    public static void main(String  args[])
    {
        Movie obj=new Movie("Spiderman",130,"NO","9.8");
        System.out.println(obj.getTitle()+" "+obj.getLength()+" "+obj.getAvailable()+" "+obj.getRating());
    }
}
