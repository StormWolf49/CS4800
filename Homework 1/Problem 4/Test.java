public class Test {
    public static void main(String[] args) {
        Folder demo = new Folder("php_demo1");
        demo.newFolder("Source Files");
        ((Folder) demo.getFile("Source Files")).newFolder(".phalcon");
        ((Folder) demo.getFile("Source Files")).newFolder("app");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("app")).newFolder("config");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("app")).newFolder("controllers");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("app")).newFolder("library");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("app")).newFolder("migrations");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("app")).newFolder("models");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("app")).newFolder("views");
        ((Folder) demo.getFile("Source Files")).newFolder("cache");
        ((Folder) demo.getFile("Source Files")).newFolder("public");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("public")).newFile(".htaccess");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("public")).newFile(".htrouter.php");
        ((Folder) ((Folder) demo.getFile("Source Files")).getFile("public")).newFile("index.html");
        demo.newFolder("Include Path");
        demo.newFolder("Remote Files");
        demo.print();
        ((Folder) demo.getFile("Source Files")).delete("app");
        System.out.println();
        demo.print();
        ((Folder) demo.getFile("Source Files")).delete("public");
        System.out.println();
        demo.print();
    }
}
