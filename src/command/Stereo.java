package command;

public class Stereo{
    private boolean isOn = false;
    public Stereo(){
    }
    public void  on(String name){
        isOn = true;
        System.out.println(name+ " is "+isOn);
    }

    public void off(String name){
        isOn = false;
        System.out.println(name+" is "+isOn);
    }

}
