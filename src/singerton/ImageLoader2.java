package singerton;

public class ImageLoader2 {
    int num=10;
    private static ImageLoader2 instance = null;
    private ImageLoader2(){

    }
    public static ImageLoader2 getInstance(){
        if(instance == null){
            instance = new ImageLoader2();
        }
        return instance;
    }
}