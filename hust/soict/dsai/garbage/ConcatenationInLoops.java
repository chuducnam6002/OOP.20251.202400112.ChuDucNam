package hust.soict.dsai.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int N = 100000; 
        
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < N; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken with '+': " + (end - start) + " ms"); 
        

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        sb.toString();
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (end - start) + " ms");
        

        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a");
        }
        sbf.toString();
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer: " + (end - start) + " ms");
    }
}
