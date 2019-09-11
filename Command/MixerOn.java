public class MixerOn implements ICommand{
    
    private Mixer mixer;

    public void mixerOnCommand(Mixer mixer) {
        this.mixer = mixer;
    }

    @Override
    public void execute(){
        System.out.println("Turning on Mixer");
        mixer.turnOn();
    }
}