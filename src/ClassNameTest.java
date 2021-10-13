public class ClassNameTest {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        String[] strings = new String[]{"C0898G", "C89345", "A8495K", "A234234234K"};
        for (String s: strings){
            boolean is = className.check(s);
            System.out.println(is);
        }
    }
}
