package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

//        nakresliPrasatko(zofka);
//        zofka.turnLeft(45);
//        zofka.penUp();
//        zofka.move(550);
//        zofka.penDown();
//
//        nakresliOsemuholnik(zofka);
//        zofka.turnRight(180);
//        zofka.penUp();
//        zofka.move(100);
//        zofka.penDown();
//
//        nakresliKolecko(zofka);
//        zofka.penUp();
//        zofka.move(200);
//        zofka.penDown();

//        nakresliSlnko(zofka);

        //Prva uroven - Slnko
        zofka.setLocation(300,100);
        nakresliSlnko(zofka);

        //Druha uroven - 5 x Domcek
        zofka.setLocation(20, 500);
        nakresliDomcek(zofka);
        zofka.setX(300);
        nakresliDomcek(zofka);
        zofka.setX(600);
        nakresliDomcek(zofka);
        zofka.setX(900);
        nakresliDomcek(zofka);
        zofka.setX(1200);
        nakresliDomcek(zofka);

        //Tretia uroven - domcek, prasiatko, domcek
        zofka.setLocation(20, 850);
        nakresliDomcek(zofka);
        zofka.setX(600);
        nakresliPrasatko(zofka);
        zofka.turnRight(45);
        zofka.setX(1200);
        nakresliDomcek(zofka);

    }

    private void nakresliDomcek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(150.0);
            zofka.turnRight(90.0);
        }

        zofka.penUp();
        zofka.move(150.0);
        zofka.penDown();

        zofka.turnRight(30.0);
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
    }

    private void nakresliSlnko(Turtle zofka) {
        for (int i = 0; i < 12; i++) {
            zofka.move(15);
            zofka.turnLeft(30);
            zofka.move(15);
            zofka.turnRight(90);
            zofka.move(15);
            zofka.turnLeft(180);
            zofka.move(15);
            zofka.turnRight(90);
        }
    }

    public void nakresliKolecko(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnLeft(20);
        }
    }

    private void nakresliOsemuholnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(45);
            zofka.turnRight(45);
        }
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
