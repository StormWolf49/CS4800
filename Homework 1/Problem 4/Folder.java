import java.util.ArrayList;

public class Folder extends File{
    private ArrayList<File> files = new ArrayList<File>();

    public Folder(String name) {
        super(name);
    }

    public File getFile(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName() == name) {
                return files.get(i);
            }
        }
        return null;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void newFile(String name) {
        files.add(new File(name));
    }

    public void addFolder(Folder folder) {
        files.add(folder);
    }

    public void newFolder(String name) {
        files.add(new Folder(name));
    }

    public void delete(String name) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName() == name) {
                ((Folder) files.get(i)).delete();
                files.remove(i);
            }
        }
    }

    public void delete() {
        for (int i = files.size() - 1; i >= 0; i--) {
            if (files.get(i) instanceof Folder) {
                ((Folder) files.get(i)).delete();
            }
            files.remove(i);
        }
    }

    public void print() {
        int x = 0;
        System.out.println("|" + getName());
        x++;
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i) instanceof Folder) {
                ((Folder) files.get(i)).print(x);
            }
            else {
                System.out.println((" ".repeat(x-1)) + "|" + files.get(i).getName());
            }
        }   
    }

    public void print(int x) {
        System.out.println((" ".repeat(x)) + "|" + getName());
        x++;
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i) instanceof Folder) {
                ((Folder) files.get(i)).print(x);
            }
            else {
                System.out.println((" ".repeat(x)) + "|" + files.get(i).getName());
            }
        }   
    }
}
