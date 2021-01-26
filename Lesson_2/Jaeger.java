public class Jaeger {
    private String modelName; //Coyote Tango   Striker Eureka
    private String mark;      //mark-1         Mark-5
    private String origin;    //Japan          Australia
    private float height;     //85.34          76.2
    private float weight;     //2.312          1.850
    private int speed;        //5              10
    private int strength;     //7              10
    private int armor;        //4              9

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public String getModelName(){
        return modelName;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public String getMark(){
        return mark;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin(){
        return origin;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public int getArmor(){
        return armor;
    }

    public boolean drift(){
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }
}