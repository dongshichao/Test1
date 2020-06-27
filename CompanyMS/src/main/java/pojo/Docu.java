package pojo;

import org.hibernate.Session;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.File;
@Entity
public class Docu {
    private int id;
    private File docu;
    private String docuFileName;
    private String docuContentType;
    private String date;
    private String docuname;


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public File getDocu() {
        return docu;
    }

    public void setDocu(File docu) {
        this.docu = docu;
    }

    public String getDocuFileName() {
        return docuFileName;
    }

    public void setDocuFileName(String docuFileName) {
        this.docuFileName = docuFileName;
    }

    public String getDocuContentType() {
        return docuContentType;
    }

    public void setDocuContentType(String docuContentType) {
        this.docuContentType = docuContentType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDocuname() {
        return docuname;
    }

    public void setDocuname(String docuname) {
        this.docuname = docuname;
    }
}
