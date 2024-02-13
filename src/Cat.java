public  class Cat extends Animal{

    @Override
    void sound() {
        Sound.playSound("cat.mp3");
    }

    @Override
    public void move() {
        System.out.println("pisica se misca diferit ");
    }

    public void move(int nrOfSteps) { // overload
        System.out.println("pisica se misca diferit "+nrOfSteps);
    }

//    @Override
//    void hitSound() {
//        Sound.playHitSound("cat.mp3");
//    }
}
