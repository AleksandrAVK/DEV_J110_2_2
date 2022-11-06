import files.*;

public class Main {
    public static void main(String[] args) {

        Parent document_files = new Document_files("j110-lab2-hiers.docx",23212,"docx, 2 pages");
        Parent multimedia_files = new Multimedia_files("06-PrettyGirl.mp3",7893454," audio, Eric Clapton, Pretty Girl, 05:28");
        Parent static_pictures_files = new Static_pictures_files("spb-map.png ",1703527,"image, 1024x3072");
        Parent video_files = new Video_files("BackToTheFuture1.avi",1470984192,"video, Back to the future I, 1985, 01:48:08, 640x352");

        Parent[] parent_array = new Parent[5];

        parent_array[0] = document_files;
        parent_array[1] = multimedia_files;
        parent_array[2] = static_pictures_files;
        parent_array[3] = video_files;

        Parent.print_All(parent_array);
        System.out.println("Hello world!");
        Parent parent = new Parent();
        
        parent.printDocument_filesArr();

    }


}