public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        AirConditioner airConditioner = new AirConditioner();
        TV tv = new TV();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        AirConditionerOnCommand airConditionerOn = new AirConditionerOnCommand(airConditioner);
        AirConditionerOffCommand airConditionerOff = new AirConditionerOffCommand(airConditioner);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, airConditionerOn, airConditionerOff);
        remoteControl.setCommand(2, tvOn, tvOff);

        remoteControl.onButtonWasPressed(0);  // Light ON
        remoteControl.offButtonWasPressed(0); // Light OFF
        remoteControl.undoButtonWasPressed(); // Undo (Light ON)

        remoteControl.onButtonWasPressed(1);  // AirConditioner ON
        remoteControl.offButtonWasPressed(1); // AirConditioner OFF
        remoteControl.undoButtonWasPressed(); // Undo (AirConditioner ON)

        Command[] partyOn = {livingRoomLightOn, airConditionerOn, tvOn};
        MacroCommand partyModeOn = new MacroCommand(partyOn);

        Command[] partyOff = {livingRoomLightOff, airConditionerOff, tvOff};
        MacroCommand partyModeOff = new MacroCommand(partyOff);

        System.out.println("Party mode ON:");
        partyModeOn.execute();
        System.out.println("Party mode OFF:");
        partyModeOff.execute();
    }
}
