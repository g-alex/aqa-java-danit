package hw_6_1.Task3;

public class Main {
    public static void main(String[] args) {
        Media[] playlist = new Media[3];

        playlist[0] = new Media("Service file", 1);
        playlist[1] = new Music("Numb", 3, "Linkin Park");
        playlist[2] = new Video("Movie trailer", 2, "1920x1080");

        for (Media item : playlist) {
            item.play();
        }
    }
}