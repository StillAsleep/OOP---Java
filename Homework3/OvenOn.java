public class OvenOn implements ICommand{
    
    private Oven oven;

    public void ovenOnCommand(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void execute(){
        System.out.println("Turning on Oven");
        oven.turnOn();
    }
}