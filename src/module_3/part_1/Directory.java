package module_3.part_1;

import java.util.List;

public class Directory {

    private List<File> files;
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    void addFiles (File file) {

        files.add(file);
    }

    void removeFiles (File file) {

        files.remove(file);
    }
}
