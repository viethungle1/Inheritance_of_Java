public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint (float xSpeed, float ySpeed ) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint move () {
        super.setX(getX()+ xSpeed);
        super.setY(getY()+ ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return " ( " + super.toString() +" ) "+" ,speed= " + " ( " + xSpeed +" , "+ ySpeed + " ) ";
    }
}
