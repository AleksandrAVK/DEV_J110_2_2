package files;

public class Document_files extends Parent {

    Multimedia_files multimedia_files = new Multimedia_files();
    int number_pages;

    public Document_files() {

    }

    public Document_files( String name_file, int size_in_bytes,String format_file) {
        super( name_file, size_in_bytes, format_file);
    }

    public Document_files(int number_pages) {
        this.number_pages = number_pages;
    }

    public Document_files(String name_file, int size_in_bytes, String format_file, int number_pages) {
        super(name_file, size_in_bytes, format_file);
        this.number_pages = number_pages;
    }

    public int getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(int number_pages) {
        if (number_pages < 0) {
            System.out.println("Номер страницы не может быть отрицательным");
            return;
        }
        ;
        this.number_pages = number_pages;
    }

    @Override
    public String toString() {
        return "Document_files{" +
                "number_pages='" + number_pages + '\'' +
                ", format_file='" + format_file + '\'' +
                ", name_file='" + name_file + '\'' +
                ", size_in_bytes=" + size_in_bytes +
                '}';
    }

    public void print_size_and_duration() {
        System.out.println("Duration = " + multimedia_files.getDuration() + ", size pictures = " + size_in_bytes);
    }
}
