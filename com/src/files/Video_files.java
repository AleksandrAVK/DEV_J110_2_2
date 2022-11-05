package files;

public class Video_files extends Multimedia_files {
    int size_pictures;

    public Video_files() {
    }
    public Video_files( String name_file, int size_in_bytes,String format_file) {
        super( name_file, size_in_bytes, format_file);
    }
    public Video_files(int size_pictures) {
        super();
        this.size_pictures = size_pictures;
    }

    public int getSize_pictures() {
        return size_pictures;
    }

    public void setSize_pictures(int size_pictures) {
        if(size_pictures < 1) {
            System.out.println("Размер картинки должен быть больше ноля");
            return;
        };
        this.size_pictures = size_pictures;
    }

    @Override
    public String toString() {
        return "Video_files{" +
                "size_pictures=" + size_pictures +
                ", description_content_in_file='" + description_content_in_file + '\'' +
                ", duration=" + duration +
                ", format_file='" + format_file + '\'' +
                ", name_file='" + name_file + '\'' +
                ", size_in_bytes=" + size_in_bytes +
                '}';
    }
    public void print_size_and_duration(){
        System.out.println("Duration = "  + duration + ", size pictures = " + size_in_bytes );
    }



}
