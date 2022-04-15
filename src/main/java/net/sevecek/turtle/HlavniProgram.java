package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);
    }

    private void nakresliPrasatko(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(150.0);
            zofka.turnRight(90.0);
        }

        zofka.turnLeft(60);
        zofka.move(150.0);
        zofka.turnRight(120.0);
        zofka.move(150.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.move(150.0);
        zofka.turnRight(90.0);
        zofka.penDown();

        pigLegs(zofka);
        zofka.turnLeft(45);
        zofka.move(150);
        pigLegs(zofka);
    }

    private void pigLegs(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
    }

}
