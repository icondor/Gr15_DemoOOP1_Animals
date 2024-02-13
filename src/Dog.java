public class Dog extends Animal{

    @Override
    void sound() {
        Sound.playSound("dog.mp3");
    }
}
