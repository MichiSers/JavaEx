package game;

public class SimplePlayer implements Player {

    private String name;
    private boolean isMaster = false;
    private int level;
    private int age;
    
    public SimplePlayer() {
        this("John Doe");
    }
    
    public SimplePlayer(String name) {
        this.name = name;
    }
    
    public SimplePlayer(String name, boolean asMaster) {
        this(name);
        this.isMaster = asMaster;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isMaster() {
        return isMaster;
    }

    @Override
    public void setMaster(boolean isMaster) {
        this.isMaster = isMaster;
    }
 
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("name:").append(name);
        if(this.age > 0)
            s.append(",age:").append(age);
        if(this.level > 0)
            s.append(",level:").append(level);
        if(this.isMaster)
            s.append(",Master");
        return s.toString();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
}
