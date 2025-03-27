public class PracticeProblem {

	public static boolean validIndex(int[] array, int index) {
        try {
            if (index >= 0 && index < array.length) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

	public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }

	public static int safeConvertStringtoInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }

	

}
