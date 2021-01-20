
/**
 * This class contains pre defined magic square of a 3*3 matrix
 * Magic square of a 3*3 matrix is 8, it is because of the constraint that the sum should be 15
 * It means 1+...+9 = 45(Total sum) => 45(Total sum)/3(Total row) = 15(magic constant)
 */
public class ThreeDegreeMagicSquareHolder {
    static final int [][][] MAGIC_SQUARE = {
        { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
        { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
        { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
        { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
        { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2} },
        { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
        { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
        { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, };

    private ThreeDegreeMagicSquareHolder(){}
}
