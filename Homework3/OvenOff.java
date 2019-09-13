public class OvenOff implements ICommand{
    
    private Oven oven;

    public void ovenOffCommand(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void execute(){
        System.out.println("Turning off Oven");
        oven.turnOff();
    }
}