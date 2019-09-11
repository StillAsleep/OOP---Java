public class OvenSetTemperature implements ICommand{

    private Oven oven;

    public void ovenSetTemperature(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void execute(){
        oven.setTemperature();
    }
}