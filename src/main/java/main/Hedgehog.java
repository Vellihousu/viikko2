package main;

public class Hedgehog {
    public int age;
    public String name;
    public String say;
    public int lap;

    public Hedgehog() {
        age = 5;
        name = "Pikseli";
    }

    public Hedgehog(int age, String name, String say, int lap) {
        this.age = age;
        this.name = name;
        this.say = say;
        this.lap = lap;
    }

     public void speak() {
        System.out.println(name+": " + say);
     }

     public void getSay(String say) {
        this.say = say;
     }

     public void getName(String name) {
        this.name = name;
     }

     public void getAge(int age) {
        this.age = age;
     }

     public void run(int lap) {
        int i = 0;
        while(i < lap) {
            System.out.println(name + " juoksee kovaa vauhtia!");
            i++;
        }     
     }

     public void giveSay() {
        System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen? ");

     }
    
}
