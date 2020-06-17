package singerton;

public class ImageLoader{
    int num=10;
    private static ImageLoader instance = new ImageLoader();
    private ImageLoader(){

    }
    public static ImageLoader getInstance(){
        return instance;
    }
}