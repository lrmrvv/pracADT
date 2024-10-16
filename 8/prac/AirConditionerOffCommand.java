public class AirConditionerOffCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.off();
    }

    @Override
    public void undo() {
        airConditioner.on();
    }
}
