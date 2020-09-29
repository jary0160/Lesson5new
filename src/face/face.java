
package face;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class face {
    private int xPos, yPos, diameter;
    private Color color;
    private Graphics g;
    public static void main(String[] args)
    {
        
    }
    public face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;

        this.g = g;
        diameter=100;
        color=Color.red;
}
        
public void draw(){
      drawHead();
      drawEyes();
      drawMouth();
}
















private void drawHead(){
    g.setColor(color);
    g.fillOval(xPos,yPos,diameter,diameter);
}
private void drawEyes(){
g.setColor(Color.yellow);
g.fillOval(xPos + (int)(.2 * diameter), yPos + (int)(.2* diameter), (int)(diameter * .25),(int)(diameter *0.25));
g.fillOval(xPos + (int)(.55 * diameter), yPos + (int)(.2* diameter), (int)(diameter * .25),(int)(diameter *0.25));

}
private void drawMouth(){
    int mx, my = 0;
mx = xPos + (int)(.2 * diameter);
mx = yPos + (int)(.2 * diameter);
g.setColor(Color.black);

g.drawLine(mx, my, mx + (int)(.5 * diameter), my);
}
}
