package MutableAndImmutable;

public class StringBilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("James");
        sb.append(" bond111111111111111111");
//        sb.append(4 + 4);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
