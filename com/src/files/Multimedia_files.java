package files;

public class Multimedia_files extends Parent{

    String description_content_in_file;
    int duration;

    public Multimedia_files() {
    }
    public Multimedia_files( String name_file, int size_in_bytes,String format_file) {
        super( name_file, size_in_bytes, format_file);
    }
    public Multimedia_files(String description_content_in_file, int duration) {
        this.description_content_in_file = description_content_in_file;
        this.duration = duration;
    }

    public String getDescription_content_in_file() {
        return description_content_in_file;
    }

    public void setDescription_content_in_file(String description_content_in_file) {
        if(description_content_in_file.length() < 1) {
            System.out.println("Описание контента не может быть пустым");
            return;
        };
        this.description_content_in_file = description_content_in_file;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration < 1) {
            System.out.println("Длительность должна быть больше ноля");
            return;
        };
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Multimedia_files{" +
                "description_content_in_file='" + description_content_in_file + '\'' +
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
