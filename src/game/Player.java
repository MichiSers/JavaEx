package game;

public interface Player {
    String getName();
    void setName(String name);
    boolean isMaster();
    void setMaster(boolean isMaster);
    int getLevel();
    void setLevel(int level);
    int getAge();
    void setAge(int age);
}
