package Matrix;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(flipAndInvertImage(matrix));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int j = 0;
            int k = image[i].length - 1;
            while (j <= k) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                if (j == k) {
                    image[i][j] = image[i][j] == 0 ? 1 : 0;
                } else {
                    image[i][j] = image[i][j] == 0 ? 1 : 0;
                    image[i][k] = image[i][k] == 0 ? 1 : 0;
                }
                j++;
                k--;
            }
        }
        return image;
    }
}
