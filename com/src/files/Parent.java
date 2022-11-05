package files;

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
}
