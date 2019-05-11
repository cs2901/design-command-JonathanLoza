package command;

public class RemoteControlTest {
    public static void main(String[] args) {

        RemoteControl remote= new RemoteControl();

        Light lightliving = new Light();
        Light lightkitchen = new Light();
        Ceiling ceiling = new Ceiling();
        Door door= new Door();
        Stereo stereo= new Stereo();

        LivingRoomOnCommand livingOn = new LivingRoomOnCommand(lightliving);
        LivingRoomOffCommand livingOff = new LivingRoomOffCommand(lightliving);
        KitchenRoomOnCommand kitchenOn= new KitchenRoomOnCommand(lightkitchen);
        KitchenRoomOffCommand kitchenOff= new KitchenRoomOffCommand(lightkitchen);
        CeilingFanOnCommand ceilingOn = new CeilingFanOnCommand(ceiling);
        CeilingFanOffCommand ceilingOff = new CeilingFanOffCommand(ceiling);
        GarageOnCommand garageOn = new GarageOnCommand(door);
        GarageOffCommand garageOff = new GarageOffCommand(door);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand("livingOn",livingOn);
        remote.setCommand("livingOff",livingOff);
        remote.setCommand("kitchenOn",kitchenOn);
        remote.setCommand("kitchenOff",kitchenOff);
        remote.setCommand("ceilingOn",ceilingOn);
        remote.setCommand("ceilingOff",ceilingOff);
        remote.setCommand("garageOn",garageOn);
        remote.setCommand("garageOff",garageOff);
        remote.setCommand("stereoOn",stereoOn);
        remote.setCommand("stereoOff",stereoOff);
        remote.buttonWasPressed("livingOn");
        remote.buttonWasPressed("livingOff");
        remote.buttonWasPressed("kitchenOn");
        remote.buttonWasPressed("kitchenOff");
        remote.buttonWasPressed("ceilingOn");
        remote.buttonWasPressed("ceilingOff");
        remote.buttonWasPressed("garageOn");
        remote.buttonWasPressed("garageOff");
        remote.buttonWasPressed("stereoOn");
        remote.buttonWasPressed("stereoOff");
    }
}
