import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Rectangle {
		
	static int[] pointsX, pointsY;
	static int[] rectPointsX = new int[4];
	static int[] rectPointsY = new int[4];
	static int maxArea = 0;
	static int numPoints;
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Map Size : Width = 100000, Height = 500
		String line;
		while ((line = in.readLine()) != null)
		    for (String numStr: line.split("\\s"))
		        numPoints += Integer.parseInt(numStr);
		pointsX = new int[numPoints];
		pointsY = new int[numPoints];
		// Inputting points
		for(int i = 0; i < numPoints; i++) {
			while ((line = in.readLine()) != null)
			    for (String numStr: line.split("\\s"))
			        pointsX[i] += Integer.parseInt(numStr);
			while ((line = in.readLine()) != null)
			    for (String numStr: line.split("\\s"))
			        pointsY[i] += Integer.parseInt(numStr);
		}
		in.close();
		
		int Cx, Dx;
		final int Cy = 0, Dy = 0;
		int area;
		for(int i = 0; i < 99999; i++) { // bottom left = (i, 0)
			Dx = i;
			for(int j = 1; j < 500; j++) { // height
				inner:
				for(int k = 1; k < 100000 - i; k++) { // width
					Cx = i + k;
					area = j * k;
					
					for(int x = 0; x < numPoints; x++) {
						if (pointsX[x] < i) continue inner;
						if(!checkInOut(pointsX[x], pointsY[x], Dx, Dy, Cx, Cy, area)) {
							continue inner;
						}
					}
					if(area > maxArea)
						maxArea = area;
				}
			}
		}
		System.out.println(maxArea);
		System.exit(0);
	}

	private static boolean checkInOut(int x, int y, int dx, int dy, int cx, int cy, int ar) {
		if ((dy == y && cx > x) || (dy == y && dx < x)) return true;
		double line1 =  Math.sqrt(Math.pow((y), 2) + Math.pow((dx - x), 2));
		double line2 =  Math.sqrt(Math.pow((y), 2) + Math.pow((cx - x), 2));
		double line3 =  Math.sqrt(Math.pow((dy - cy), 2) + Math.pow((dx - cx), 2));
		double s = (line1 + line2 + line3) / 2;
		int area = (int) Math.sqrt(s * (s - line1) * (s - line2) * (s - line3));
		if (area <= (ar / 2)) return true;
		return false;
	}
}