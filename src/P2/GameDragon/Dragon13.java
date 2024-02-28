package P2.GameDragon;

public class Dragon13 {
    int x, y, width, height;

    public Dragon13(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this. width = width;
        this.height = height;
    }

    void moveLeft() {
        x -= 1;
        detectCollision(x, y);
    }

    void moveRight() {
        x += 1;
        detectCollision(x, y);
    }

    void moveUp() {
        y -= 1;
        detectCollision(x, y);
    }

    void moveDown() {
        y += 1;
        detectCollision(x, y);
    }

    void tampilanPosisi() {
        System.out.println("Posisi Dragon: x : " + x + " dan y : " + y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over");
            System.exit(0);
        }
    }
}
