package models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    private int id;
    private String fileName;
    private String extension;
    private int fileSize;
    Folder folder;

    public File() {
    }

    public File(String fileName, String extension, int fileSize, Folder folder) {
        this.fileName = fileName;
        this.extension = extension;
        this.fileSize = fileSize;
        this.folder = folder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Column(name="extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Column(name="file_size")
    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int size) {
        this.fileSize = fileSize;
    }

    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
