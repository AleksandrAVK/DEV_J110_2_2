package files;

public class Static_pictures_files  extends Parent {
    Multimedia_files multimedia_files = new Multimedia_files();
    int width_pictures;
    int height_pictures;

    public Static_pictures_files() {
    }
    public Static_pictures_files( String name_file, int size_in_bytes,String format_file) {
        super( name_file, size_in_bytes, format_file);
    }
    public Static_pictures_files(Multimedia_files multimedia_files, int width_pictures, int height_pictures) {
        this.multimedia_files = multimedia_files;
        this.width_pictures = width_pictures;
        this.height_pictures = height_pictures;
    }



    public int getWidth_pictures() {
        return width_pictures;
    }

    public void setWidth_pictures(int width_pictures) {
        if(width_pictures < 1) {
            System.out.println("Ширина должна быть больше ноля");
            return;
        };
        this.width_pictures = width_pictures;
    }

    public int getHeight_pictures() {
        return height_pictures;
    }

    public void setHeight_pictures(int height_pictures) {
        if(height_pictures < 1) {
            System.out.println("Высота должна быть больше ноля");
            return;
        };
        this.height_pictures = height_pictures;
    }

    @Override
    public String toString() {
        return "Static_pictures_files{" +
                "width_pictures=" + width_pictures +
                ", height_pictures=" + height_pictures +
                ", format_file='" + format_file + '\'' +
                ", name_file='" + name_file + '\'' +
                ", size_in_bytes=" + size_in_bytes +
                '}';
    }
    public void print_size_and_duration(){
        System.out.println("Duration = "  + multimedia_files.getDuration() + ", size pictures = " + size_in_bytes );
    }
}
