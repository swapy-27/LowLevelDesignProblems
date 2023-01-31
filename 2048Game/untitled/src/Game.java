import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Game {
    private int[][] matrix;
    private int size;
    static Random rand = new Random();

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;

    }

    public Game(int n) {
        this.size = n;
        this.matrix = new int[n][n];
        this.addRandomSpace();
        this.addRandomSpace();
        this.printMatrix();
    }

    public void printMatrix() {
        Arrays.stream(this.matrix).forEach(e -> System.out.println(Arrays.toString(e)));
    }

    public void addRandomSpace() {
        int row_idx = rand.nextInt(4);
        int col_idx = rand.nextInt(4);
        if (matrix[row_idx][col_idx] == 0) {
            matrix[row_idx][col_idx] = 2;
            return;
        } else {
            this.addRandomSpace();
        }
    }

    public int moveDown(int sum) {
        for (int i = 0; i < this.size; i++) {
            int prevVal = -1;
            Boolean wallHit = true;
            for (int j = 0; j < this.size; j++) {
                int curr = this.matrix[j][i];
                if (prevVal == -1) {
                    prevVal = curr;
                    this.matrix[j][i] = 0;
                } else {
                    if (curr != 0) {
                        if (prevVal > 0  && curr==prevVal) {
                            curr = curr + prevVal;
                            this.matrix[j][i] = curr;
                            wallHit = false;
                            sum=Math.max(sum,curr);
                            break;
                        }
                        else if (prevVal>0 && curr!=prevVal) {
                            this.matrix[j-1][i]=prevVal;
                            wallHit=false;
                            break;
                        }
                        prevVal = curr;
                        this.matrix[j][i] = 0;
                    }
                }
            }
            if (wallHit) this.matrix[this.size - 1][i] = prevVal;
        }
        this.addRandomSpace();
        this.printMatrix();
        return sum;
    }

    public int moveUp(int sum) {
        for (int i = 0; i < this.size; i++) {
            int prevVal = -1;
            Boolean wallHit = true;
            for (int j = this.size - 1; j >= 0; j--) {
                int curr = this.matrix[j][i];
                if (prevVal == -1) {
                    prevVal = curr;
                    this.matrix[j][i] = 0;
                } else {
                    if (curr != 0) {
                        if (prevVal > 0 && curr==prevVal) {
                            curr = curr + prevVal;
                            this.matrix[j][i] = curr;
                            wallHit = false;
                            sum=Math.max(sum,curr);
                            break;
                        } else if (prevVal>0 && curr!=prevVal) {
                            this.matrix[j+1][i]=prevVal;
                            wallHit=false;
                            break;
                        }
                        prevVal = curr;
                        this.matrix[j][i] = 0;
                    }
                }
            }
            if (wallHit) this.matrix[0][i] = prevVal;
        }
        this.addRandomSpace();
        this.printMatrix();
        return sum;
    }

    public int moveLeft(int sum) {
        for (int i = 0; i < this.size; i++) {
            int prevVal = -1;
            Boolean wallHit = true;
            for (int j = this.size - 1; j >= 0; j--) {
                int curr = this.matrix[i][j];
                if (prevVal == -1) {
                    prevVal = curr;
                    this.matrix[i][j] = 0;
                } else {
                    if (curr != 0) {
                        if (prevVal > 0 && curr==prevVal) {
                            curr = curr + prevVal;
                            this.matrix[i][j] = curr;
                            wallHit = false;
                            sum=Math.max(sum,curr);
                            break;
                        }else if (prevVal>0 && curr!=prevVal) {
                            this.matrix[i][j+1]=prevVal;
                            wallHit=false;
                            break;
                        }
                        prevVal = curr;
                        this.matrix[i][j] = 0;
                    }
                }
            }
            if (wallHit) this.matrix[i][0] = prevVal;
        }
        this.addRandomSpace();
        this.printMatrix();
        return sum;

    }

    public int moveRight( int sum ) {
        for (int i = 0; i < this.size; i++) {
            int prevVal = -1;
            Boolean wallHit = true;
            for (int j = 0; j < this.size; j++) {
                int curr = this.matrix[i][j];
                if (prevVal == -1) {
                    prevVal = curr;
                    this.matrix[i][j] = 0;
                } else {
                    if (curr != 0 ) {
                        if (prevVal > 0 && curr==prevVal) {
                            curr = curr + prevVal;
                            this.matrix[i][j] = curr;
                            sum=Math.max(sum,curr);
                            wallHit = false;
                            break;
                        }else if (prevVal>0 && curr!=prevVal) {
                            this.matrix[i][j-1]=prevVal;
                            wallHit=false;
                            break;
                        }
                        prevVal = curr;
                        this.matrix[i][j] = 0;
                    }
                }
            }
            if (wallHit) this.matrix[i][this.size - 1] = prevVal;
        }
        this.addRandomSpace();
        this.printMatrix();
        return sum;
    }
}

