package exceptions;

public class TestData {
    public static void main(String[] args) {
        try {
            Data.checkData("ASAD","ASD","ASD");
            Data.checkData("ASAD","asw","asd");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("валидация данных провалена");
            e.printStackTrace();
        } finally {
            System.out.println("блок отработал успешно");
        }
    }
}
