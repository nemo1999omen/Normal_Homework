public class Main2 {
    public static void main(String[] args){
        String matrixCorrect[][] = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}
        };
        String matrixInCorrect[][] = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
        };
        String matrixInCorrect2[][] = {
                {"1","2","3","4"},
                {"1","2","3"},
                {"1","2","3","4"},
                {"1","2","3","4"}
        };
        String matrixInCorrectChar[][] = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","fred","4"},
                {"1","2","3","4"}
        };
        try{
            System.out.println(mass.convertToStr(matrixCorrect));
        }
        catch(CustomException error){
            System.err.println(error.getMessage());
        }
        try{
            System.out.println(mass.convertToStr(matrixInCorrect));
        }
        catch(CustomException error){
            System.err.println(error.getMessage());
        }
        try{
            System.out.println(mass.convertToStr(matrixInCorrect2));
        }
        catch(CustomException error){
            System.err.println(error.getMessage());
        }
        try{
            System.out.println(mass.convertToStr(matrixInCorrectChar));
        }
        catch(CustomException error){
            System.err.println(error.getMessage());
        }

    }
}



