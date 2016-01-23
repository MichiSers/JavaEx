package gaem;

/**
 * Created by Michi on 23.01.2016.
 */
public class SimplePlayer implements Player{

    private String name;
    private boolean isMaster;

    public SimplePlayer(String name){
        this.name = name;
    }

    @Override
    public void asMaster(boolean isMaster) {
        this.isMaster = isMaster;
//        return this;
    }

    @Override
    public String toString(){
        if(isMaster){
            return name + " is master";
        }else{
            return name;
        }
    }
}
