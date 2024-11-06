public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audioSystem = new AudioSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();
        GameConsole gameConsole = new GameConsole();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audioSystem, dvdPlayer, gameConsole);

        homeTheater.watchMovie();
        homeTheater.setVolume(10);
        homeTheater.stopMovie();

        homeTheater.playGame("Super Mario");

        homeTheater.listenToMusic();

        homeTheater.turnOffAll();
    }
}
