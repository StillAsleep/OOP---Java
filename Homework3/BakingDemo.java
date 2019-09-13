public class BakingDemo {

    public static void main(String[] args) {

        Mixer mixer = new Mixer();
        Oven oven = new Oven();
        MixerOn mixerOn = new MixerOn();
        MixerOff mixerOff = new MixerOff();
        OvenOn ovenOn = new OvenOn();
        OvenOff ovenOff = new OvenOff();
        OvenSetTemperature temp = new OvenSetTemperature();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(mixerOn);
        remote.pressButton();
        remote.setCommand(mixerOff);
        remote.pressButton();
        remote.setCommand(ovenOn);
        remote.pressButton();
        remote.setCommand(ovenOff);
        remote.pressButton();
        remote.setCommand(temp);
        remote.pressButton();
    }
}