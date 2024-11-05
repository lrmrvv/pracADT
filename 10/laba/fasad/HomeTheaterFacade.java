public class HomeTheaterFacade {
    private AudioSystem audioSystem;
    private VideoProjector videoProjector;
    private LightingSystem lightingSystem;

    public HomeTheaterFacade(AudioSystem audioSystem, VideoProjector videoProjector, LightingSystem lightingSystem) {
        this.audioSystem = audioSystem;
        this.videoProjector = videoProjector;
        this.lightingSystem = lightingSystem;
    }

    public void startMovie() {
        System.out.println("Подготовка к просмотру фильма...");
        lightingSystem.turnOn();
        lightingSystem.setBrightness(5);
        audioSystem.turnOn();
        audioSystem.setVolume(8);
        videoProjector.turnOn();
        videoProjector.setResolution("HD");
        System.out.println("Начался фильм.");
    }

    public void endMovie() {
        System.out.println("Выключение фильма...");
        videoProjector.turnOff();
        audioSystem.turnOff();
        lightingSystem.turnOff();
        System.out.println("Закончился фильм.");
    }
}
