package snippets;

public class SnippetTester {

        public void method(String str){
            System.out.println("String method " + str);
        }

        public void method(Integer int1){
            System.out.println("Integer method " + int1);
        }

        public void method(Object object) {
            System.out.println("simple method " + object);
        }

        public static void main(String[] args) {
            SnippetTester instance = new SnippetTester();
            instance.method("Hello");
            instance.method(new String("World"));
            String str = new String("Apple in the world");
            instance.method((Object)str);
            instance.method((Integer)null);
        }
}
