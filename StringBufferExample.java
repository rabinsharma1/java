class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Best");

        stringBuffer.append(" Week");
        System.out.println(stringBuffer);

        stringBuffer.insert(5, " Month");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.delete(0, 4);
        System.out.println(stringBuffer);

        stringBuffer.setLength(3);
        System.out.println(stringBuffer);

        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
    }
}
