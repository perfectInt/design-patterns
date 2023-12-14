package structuralpatterns.composite.example;

/**
 * Паттерн Компоновщик (Composite) объединяет группы объектов в древовидную структуру
 * по принципу "часть-целое и позволяет клиенту одинаково работать как с отдельными объектами, так и с группой объектов.
 */
public class Main {
    public static void main(String[] args) {
        Component fileSystem = new Directory("File system");
        Component diskC = new Directory("Disk C");
        Component pngFile = new File("123.png");
        Component docxFile = new File("Document.docx");
        diskC.add(pngFile);
        diskC.add(docxFile);
        fileSystem.add(diskC);
        fileSystem.print();
        System.out.println();
        diskC.remove(pngFile);
        Component docsFolder = new Directory("My documents");
        Component txtFile = new File("readme.txt");
        Component javaFile = new File("Hello.java");
        docsFolder.add(txtFile);
        docsFolder.add(javaFile);
        diskC.add(docsFolder);
        fileSystem.print();
    }
}
