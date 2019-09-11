public class RemoteControl{

    ICommand command;

    public void setCommand(ICommand command){
        this.command= command;
    }

    public void pressButton() {
        command.execute();
    }
}