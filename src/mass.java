public class mass {
    public static int convertToStr(String[][] strMatrix)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != strMatrix.length) throw new MyArraySizeException();

        for (int i = 0; i < strMatrix.length; i++) {

            if (4 != strMatrix[i].length) throw new MyArraySizeException();

            for (int j = 0; j < strMatrix[i].length; j++) {

                try {
                    sum += Integer.parseInt(strMatrix[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
