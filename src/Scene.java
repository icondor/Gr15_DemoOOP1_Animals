public class Scene {

    private final int MAXANIMALS=10;

   private Animal[] animalsInMyScene= new Animal[MAXANIMALS]; // o scena de animale generice

   public void addAnimals() {
     animalsInMyScene[0]= new Dog(); // pe scena am pus o pisica
        animalsInMyScene[1]= new Cow();
        animalsInMyScene[2]= new Cat();
        animalsInMyScene[3]= new Dog();
    }

    public void playAll() {

        for(int i = 0; i<animalsInMyScene.length;i++) {
            if(animalsInMyScene[i]!=null)
                 animalsInMyScene[i].sound();
        }
    }

    public void moveAll() {

        for(int i = 0; i<animalsInMyScene.length;i++) {
            if(animalsInMyScene[i]!=null)
                animalsInMyScene[i].move();
        }
    }

}
