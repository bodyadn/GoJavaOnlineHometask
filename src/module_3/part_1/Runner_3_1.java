package module_3.part_1;

public class Runner_3_1 {
    public static void main(String[] args) {
        File file1 = new File();
        File file2 = new File();
        Directory directory = new Directory();
        directory.addFiles(file1);
        directory.addFiles(file2);
        directory.removeFiles(file1);
        System.out.println();
    }
}
