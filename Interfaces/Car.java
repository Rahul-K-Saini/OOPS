package Interfaces;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake(String br) {
        System.out.println(br);
    }

    @Override
    public void start(String st) {
        System.out.println(st);
    }

    @Override
    public void stop(String stp) {
        System.out.println(stp);

    }

    @Override
    public void accelerate(String acc) {
        System.out.println(acc);
    }

}
