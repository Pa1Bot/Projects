// Encapsulation
class Alien
{
    private int age;
    private String name;
    private String bestTech;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBestTech() {
        return bestTech;
    }
    public void setBestTech(String bestTech) {

            this.bestTech = bestTech;
    }

}

public class ThisKeyword
{
    public static void main(String[] args)
    {
        Alien ashish = new Alien();
        ashish.setAge(31);
        ashish.setName("Ashish");
        ashish.setBestTech("Java");
        System.out.println(ashish.getAge());
        ashish.setBestTech("Vision Pro");
        System.out.println(ashish.getBestTech());

    }

}
