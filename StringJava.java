
class StringJava {
    public static void main(String[] args) {
        String test = "RabinSharma";
        System.out.println(test.length());
        System.out.println(test.charAt(5));
        System.out.println(test.substring(2));
        System.out.println(test.substring(2, 3)); // index 2 ko included but 5 ko not included
        String s1 = "Rabin";
        String s2 = "Sharma";
        String output = s1.concat(s2);
        System.out.println(output);

        String projectName = "The World Shall Know Pain";
        int projectOutput = projectName.indexOf("now");
        System.out.println(projectOutput);
        System.out.println(projectName.indexOf("woe", 3)); // 3 index vanda paxadi ko matra khojna kaam garxa

        Boolean resultBool = test.equals(projectName);
        System.out.println(resultBool);

        Boolean isEqualsByIgnoring = test.equalsIgnoreCase(test);
        System.out.println(isEqualsByIgnoring);

        String test2 = "abc";
        String test3 = "def";
        int testOutput = test2.compareTo(test3);
        System.out.println(testOutput);

        int testingCompareToIgnore = test2.compareToIgnoreCase(test3);
        System.out.println(testingCompareToIgnore);

        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());
        System.out.println(test.trim());
        System.out.println(test.replace("G","r"));


    }
}