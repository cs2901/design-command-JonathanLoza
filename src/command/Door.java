package command;

public class Door{
    private boolean isOpen = false;
    public Door(){
    }
    public void  on(String name){
        isOpen = true;
        System.out.println("Door of "+name+ " is "+isOpen);
    }

    public void off(String name){
        isOpen = false;
        System.out.println("Door of "+name+" is "+isOpen);
    }

}
