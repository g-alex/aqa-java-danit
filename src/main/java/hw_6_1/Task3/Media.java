package hw_6_1.Task3;

class Media {
    protected String title;
    protected int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing multimedia");
    }
}
