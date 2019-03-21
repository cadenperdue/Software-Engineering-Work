/**
 * The Client Class uses the new MyCanvas class.
 * 
 * @author Dr. Ray Russell 
 * @version 0.1
 */
public class NewReleaseClient
{
    private MyNewCanvas canvas;

    public NewReleaseClient()
    {
        System.out.println ("Constructing the Client.");
        canvas = new MyNewCanvas();
    }

    public void doSomeWork (){
        //Sample code for what a new client would look like without an adaptor.
        canvas.clear();
        // Call equivalent to the drawTriangle call in Client
        canvas.drawShape(new int[] {10, 20, 30}, new int[] {0, 40, 0}, 3, 37, 99);
    }
}
