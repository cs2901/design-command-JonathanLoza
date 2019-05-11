package command;

public class Ceiling{
    private boolean level = false;
    public Ceiling(){
    }
    public void  on(String name){
        level = true;
        System.out.println("Ceiling "+name+ " is high");
    }

    public void off(String name){
        level = false;
        System.out.println("Ceiling "+name+" is low");
    }

}
