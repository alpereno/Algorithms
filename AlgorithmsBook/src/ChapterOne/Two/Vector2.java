package ChapterOne.Two;

public class Vector2 {
    public double x;
    public double y;
    
    public Vector2(double x, double y){
        this.x = x;
        this.y=y;
    }
    public Vector2(Vector2 vector){
        this.x = vector.x;
        this.y = vector.y;
    }
    
    public double distance(Vector2 targetVector){
        double distX = targetVector.x - this.x;
        double distY = targetVector.y - this.y;
        return Math.sqrt(distX*distX+distY*distY);
    }
}
