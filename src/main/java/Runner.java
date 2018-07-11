import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args){

        Folder folder1 = new Folder("home work");
        DBHelper.save(folder1);

        Folder folder2 = new Folder("class notes");
        DBHelper.save(folder2);

        File file1 = new File("day 1 homework", "java", 1.5, folder1);
        DBHelper.save(file1);

        File file2 = new File("day 2 homework", "ruby", 1.5, folder1);
        DBHelper.save(file2);

        File file3 = new File("day 1 classwork", "java", 1.5, folder2);
        DBHelper.save(file3);

        File file4 = new File("day 2 classwork", "ruby", 2, folder2);
        DBHelper.save(file4);

    }
}
