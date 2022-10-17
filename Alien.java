import javax.swing.ImageIcon;

public class Alien extends Sprite {

    private Bomb bomb;

    public Alien(int x, int y) {

        initAlien(x, y);
    }

    private void initAlien(int x, int y) {
		//set position start play Game of Alien
        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y); //every Alien have bomb

        ImageIcon ii = new ImageIcon("images/alien1.png"); // image alien
        setImage(ii.getImage());
    }

    public void act(int direction) {
		// move Alien
        this.x += direction;
    }

    public Bomb getBomb() {
		//call address data
        return bomb;
    }

    public class Bomb extends Sprite {

        private boolean destroyed;

        public Bomb(int x, int y) {

            initBomb(x, y);
        }

        private void initBomb(int x, int y) {

            setDestroyed(true); // you can't see bomb
			// set position put bomb
            this.x = x;
            this.y = y;

            ImageIcon ii = new ImageIcon("images/bomb.png"); // image bomb
            setImage(ii.getImage());
        }

        public void setDestroyed(boolean destroyed) {

            this.destroyed = destroyed; //set you can see/don't see
        }

        public boolean isDestroyed() {

            return destroyed; // call active bomb
        }
    }
}