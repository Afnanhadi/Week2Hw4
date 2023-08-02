public class MovablePoint implements Movable {
    private int X;
    private int y;
    private int xSpeed;
    private int ySpeed;

 public MovablePoint(int X,int y,int xSpeed,int ySpeed){
        this.X=X;
        this.y=y;
        this.ySpeed=ySpeed;
        this.xSpeed=xSpeed;
         }

        @Override
        public void moveUp () {
            System.out.println(y+= ySpeed);
        }

        @Override
        public void moveLeft () {

            System.out.println(X-= xSpeed);

        }

        @Override
        public void moveRight () {
            System.out.println(X += xSpeed);
        }

        @Override
        public void moveDown () {
            System.out.println(y -= ySpeed);
        }
    }
