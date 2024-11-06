class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audioSystem;
    private DVDPlayer dvdPlayer;
    private GameConsole gameConsole;

    public HomeTheaterFacade(TV tv, AudioSystem audioSystem, DVDPlayer dvdPlayer, GameConsole gameConsole) {
        this.tv = tv;
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.gameConsole = gameConsole;
    }

    public void watchMovie() {
        System.out.println("\nПодготовка к просмотру фильма...");
        tv.turnOn();
        tv.setChannel(3); 
        audioSystem.turnOn();
        audioSystem.setVolume(5);
        dvdPlayer.play();
        System.out.println("Приятного просмотра!");
    }

    public void stopMovie() {
        System.out.println("\nЗавершение просмотра фильма...");
        dvdPlayer.stop();
        audioSystem.turnOff();
        tv.turnOff();
    }

    public void playGame(String game) {
        System.out.println("\nПодготовка к запуску игры...");
        gameConsole.turnOn();
        tv.turnOn();
        tv.setChannel(5); 
        audioSystem.turnOn();
        audioSystem.setVolume(7);
        gameConsole.startGame(game);
        System.out.println("Игра началась!");
    }

    public void listenToMusic() {
        System.out.println("\nПодготовка к прослушиванию музыки...");
        tv.turnOn();
        audioSystem.turnOn();
        audioSystem.setVolume(8);
        System.out.println("Приятного прослушивания!");
    }

    public void turnOffAll() {
        System.out.println("\nВыключение всей системы...");
        dvdPlayer.stop();
        gameConsole.turnOn();
        audioSystem.turnOff();
        tv.turnOff();
        System.out.println("Система выключена.");
    }

    public void setVolume(int level) {
        audioSystem.setVolume(level);
    }
}
