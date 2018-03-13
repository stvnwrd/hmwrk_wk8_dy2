import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Folder folder1 = new Folder("Holiday");
        DBHelper.save(folder1);

        Folder folder2 = new Folder("Work");
        DBHelper.save(folder2);

        File file1 = new File("GrandCanyon", "jpeg", 1654910, folder1);
        DBHelper.save(file1);

        File file2 = new File("Itinerary", "txt", 2526, folder1);
        DBHelper.save(file2);

        File file3 = new File("app", "rb", 4503, folder2);
        DBHelper.save(file3);

        File file4 = new File("end_of_term_presentation", "ppt", 2359309, folder2);
        DBHelper.save(file4);

        Folder foundFolder = DBHelper.find(Folder.class, folder2.getId());

        File foundFile = DBHelper.find(File.class, file2.getId());

        List<File> results = DBHelper.getFilesByFolder(folder2);

        DBHelper.delete(file3);

        file4.setFileName("eot_pres_FINAL_FINAL_v2");
        DBHelper.update(file4);

        List<File> results2 = DBHelper.getFilesByFolder(folder2);




    }
}
