import javax.swing.ImageIcon;

public class Shot extends Sprite {
	private Shot shot;
    public Shot() {

    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {
		
			shot = new Shot();
			ImageIcon ii = new ImageIcon("images/shot.png");//image shot
			setImage(ii.getImage());

			int H_SPACE = 6; //start image shot (x)
			setX(x + H_SPACE);

			int V_SPACE = 1; //start image shot (y)
			setY(y - V_SPACE);

    }
}