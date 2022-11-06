package files;

import java.util.concurrent.atomic.AtomicReference;

public class Parent {

    String name_file;
    int size_in_bytes;
    String format_file;

    public Parent() {
    }

    public Parent( String name_file, int size_in_bytes,String format_file) {

        this.name_file = name_file;
        this.size_in_bytes = size_in_bytes;
        this.format_file = format_file;
    }

    public static void print_All(Parent[] fileArray){
        for (int i = 0; i < fileArray.length -1; i++) {
            System.out.println(fileArray[i].name_file + " | " + fileArray[i].size_in_bytes + " | "+ fileArray[i].format_file);
        }


    }
    public String getFormat_file() {
        return format_file;
    }

    public void setFormat_file(String format_file) {
        this.format_file = format_file;
    }

    public String getName_file() {
        return name_file;
    }

    public void setName_file(String name_file) {
        this.name_file = name_file;
    }

    public int getSize_in_bytes() {
        return size_in_bytes;
    }

    public void setSize_in_bytes(int size_in_bytes) {
        this.size_in_bytes = size_in_bytes;
    }

    public Document_files[] getDocument_files_array(){

        Document_files doc_files1 = new Document_files("Document_files.docx",232121,"docx, 12 pages");

        Document_files doc_files2 = new Document_files("j110-lab2-Document_files", 232122, "docx, 22 pages");

        Document_files doc_files3 = new Document_files("j110-lab2-hiers.Document_files",232132,"docx, 32 pages");

        Document_files doc_files4 = new Document_files("j110-Document_files",232124,"docx, 42 pages");

        Document_files[] doc_files_array = new Document_files[5];

        doc_files_array[0] = doc_files1;
        doc_files_array[1] = doc_files2;
        doc_files_array[2] = doc_files3;
        doc_files_array[3] = doc_files4;

        return doc_files_array;
    };

    public void printDocument_filesArr(){

        print_All(getDocument_files_array());
/*
print_All отработал благодаря тому, что мы можем приводить типы от наследника к родителю и благодаря тому,
что в Document_files есть конструтор со значениями конструктора родителя super( name_file, size_in_bytes, format_file);
 */
    }


}
