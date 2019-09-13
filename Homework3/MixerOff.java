public class MixerOff implements ICommand{
    
    private Mixer mixer;

    public void mixerOffCommand(Mixer mixer) {
        this.mixer = mixer;
    }

    @Override
    public void execute(){
        System.out.println("Turning off Mixer");
        mixer.turnOff();
    }
}