package interfaces;

public interface Youtuber extends VideoEditor {

    int x = 2;

    void makeVideo();

    default void uploadVideo() {
        System.out.println("upload video");
    }

}
