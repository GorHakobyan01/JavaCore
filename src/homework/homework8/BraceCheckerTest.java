package homework.homework8;

public class BraceCheckerTest {

	public static void main(String[] args) {
		BraceChecker braceChecker = new BraceChecker("(Hello} {World}");
		braceChecker.check();
	}
}
