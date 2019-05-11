package command;
import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
  Map<String, Command> nombreMap = new HashMap<String, Command>();

  public RemoteControl(){

  }

  public void setCommand(String action,Command command){
      nombreMap.put(action, command);
  }

  public void buttonWasPressed(String action){
      nombreMap.get(action).execute();
  }
}
