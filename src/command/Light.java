package command;

public class Light {
    private boolean isOn = false;
    public Light(){
    }
    public void  on(String name){
        isOn = true;
        System.out.println("Light of "+name+ " is "+isOn);
    }

    public void off(String name){
        isOn = false;
        System.out.println("Light of "+name+" is "+isOn);
    }

}
