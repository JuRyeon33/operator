//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 15;

        a += 5;
        System.out.println(a); // 15

        b -= 5;
        System.out.println(b); // 10

        b *= 5;
        System.out.println(b); // 50

        b /= 2;
        System.out.println(b); // 25

        b %= 3;
        System.out.println(b); // 1
    }
}