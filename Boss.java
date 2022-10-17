import javax.swing.ImageIcon;

public class Boss extends Sprite {
	private Ball ball;

	public Boss(int x, int y) {

        initBoss(x, y);
    }

    private void initBoss(int x, int y) {

        this.x = x;
        this.y = y;


        ball = new Ball(x,y);

        ImageIcon ii = new ImageIcon("images/dragon.png"); // image alien
        setImage(ii.getImage());

		setVisible(false);//show (turn on/off) image boss dragon		
    }

	public void act(int direction) {
		// move Boss
        this.x += direction;
    }

     public Ball getBall() {

        return ball;
    }

    public class Ball extends Sprite {

        private boolean destroyed;

        public Ball(int x, int y) {

            initBall(x, y);
        }

        private void initBall(int x, int y) {

            setDestroyed(true);

            this.x = x;
            this.y = y;

            ImageIcon ii = new ImageIcon("images/Bossbomb.png"); // image ball
            setImage(ii.getImage());
        }

        public void setDestroyed(boolean destroyed) {

            this.destroyed = destroyed;
        }

        public boolean isDestroyed() {

            return destroyed;
        }
    }
}