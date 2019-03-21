
/**
 * The Client Class uses the legacy MyCanvas class.
 * 
 * @author Caden Perdue, Trey Roberts 
 * @version 0.1
 */
public class Client
{
    private MyNewCanvasAdapter canvas;

    public static void main(String[] args){
        Client client = new Client();
        client.doSomeWork();
    }


    public Client()
    {
        System.out.println ("Constructing the Client.");
        canvas = new MyNewCanvasAdapter();
    }

    public void doSomeWork (){
        canvas.clear();
        canvas.setLineColor(37);
        canvas.drawSquare(20, 40, 50);
        canvas.drawRectangle(15, 35, 18, 36);
        canvas.setFillColor(99);
        canvas.drawRightTriangle(88, 52, 20, -10);
        canvas.drawTriangle(new int[] {10, 20, 30}, new int[] {0, 40, 0});
        canvas.drawLine(50, 70, 10, 49);
    }

}
