public class GraphicsTransformation {
    public static void main(String[] args) {
        // Transformation matrix Gamma (example values)
        double t1 = 1, t2 = 2, t3 = 3, t4 = 4;
        
        // Original coordinates
        double[] x = {-3, 2, -5, -2};
        double[] y = {6, -4, 3, 4};
        
        // Transformed coordinates
        double[] xPrime = new double[4];
        double[] yPrime = new double[4];
        
        // Apply transformation matrix Gamma
        for (int i = 0; i < 4; i++) {
            xPrime[i] = t1 * x[i] + t2 * y[i];
            yPrime[i] = t3 * x[i] + t4 * y[i];
        }
        
        // Print transformed coordinates
        System.out.println("Transformed Coordinates:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Point %d: (%.2f, %.2f)%n", i + 1, xPrime[i], yPrime[i]);
        }
        
        // Reflected coordinates
        double[] xDoublePrime = new double[4];
        double[] yDoublePrime = new double[4];
        
        // Apply reflection matrix for y-axis
        for (int i = 0; i < 4; i++) {
            xDoublePrime[i] = -xPrime[i];
            yDoublePrime[i] = yPrime[i];
        }
        
        // Print reflected coordinates
        System.out.println("Reflected Coordinates:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Point %d: (%.2f, %.2f)%n", i + 1, xDoublePrime[i], yDoublePrime[i]);
        }
    }
}