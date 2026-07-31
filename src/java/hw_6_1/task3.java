package hw_6_1;

class Media {
    protected String title;
    protected int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Воспроизведение мультимедиа");
    }
}

class Music extends Media {
    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Воспроизводится музыка " + artist + ": " + title);
    }
}

class Video extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Воспроизводится видео " + title + " в разрешении " + resolution);
    }
}

public class task3 {
    public static void main(String[] args) {
        Media[] playlist = new Media[3];

        playlist[0] = new Media("Служебный файл", 1);
        playlist[1] = new Music("Numb", 3, "Linkin Park");
        playlist[2] = new Video("Трейлер фильма", 2, "1920x1080");

        for (Media item : playlist) {
            item.play();
        }
    }
}