//author caden Perdue, Trey Roberts
public class MyNewCanvasAdapter implements MyCanvas 
{
	private int lineColor = 0;
	private int fillColor = 0; 
	private MyNewCanvas canvas;
	
	public MyNewCanvasAdapter()
	{
		this.canvas = canvas;
	}
	
	public void clear()
	{
		canvas.clear();
	}
    public void setLineColor(int lineColor)
    {
        this.lineColor = lineColor;
    }

    public void setFillColor(int fillColor)
    {
        this.fillColor = fillColor;
    }

	public void drawSquare(int xPosition, int yPosition, int length)
	{
        int xPosition2 = xPosition + length;
        int yPosition2 = yPosition - length;
        int[] xArr = new int[]{xPosition, xPosition2, xPosition, xPosition2};
        int[] yArr = new int[]{yPosition, yPosition, yPosition2, yPosition2};
        int sides = 4;
		canvas.drawShape(xArr, yArr, sides, lineColor, fillColor);
	}
    
    public void drawRectangle(int xPosition, int yPosition, int topLength, int sideLength)
    {
        int xPosition2 = xPosition + topLength;
        int yPosition2 = yPosition - sideLength;
        int[] xArr = new int[]{xPosition, xPosition2, xPosition, xPosition2};
        int[] yArr = new int[]{yPosition, yPosition, yPosition2, yPosition2};
        int sides = 4;
        canvas.drawShape(xArr, yArr, sides, lineColor, fillColor);
    }

    public void drawRightTriangle(int xPosition, int yPosition, int verticalLeg, int horizontalLeg)
    {
		int[] xArr = new int[]{xPosition, xPosition, xPosition + horizontalLeg};
		int[] yArr = new int[]{yPosition, yPosition - verticalLeg,yPosition};
		int sides = 3;
		canvas.drawShape(xArr,yArr, sides, lineColor, fillColor);
    }

    public void drawTriangle(int[] xPosition, int[] yPosition)
    {
		canvas.drawShape(xPosition,yPosition,3,lineColor,fillColor);
    }

    public void drawLine(int xStart, int yStart, int xEnd, int yEnd)
    {
        int[] xArr = new int[]{xStart, xEnd};
        int[] yArr = new int[]{xStart, xEnd};
        int sides = 1;
        canvas.drawShape(xArr, yArr, sides, lineColor, fillColor);
    }
}
