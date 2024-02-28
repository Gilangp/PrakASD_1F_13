package P2.GameDragon;

public class DragonMain13 {
    public static void main(String[] args) {
        Dragon13 dragon1  = new Dragon13(0,3,0,5);
        
        dragon1.moveLeft();
        dragon1.tampilanPosisi();

        dragon1.moveDown();
        dragon1.tampilanPosisi();

        dragon1.moveRight();
        dragon1.tampilanPosisi();

        dragon1.moveUp();
        dragon1.tampilanPosisi();

        dragon1.moveLeft();
        dragon1.tampilanPosisi();
    }
}
