package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Board;
import pojo.Docu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class AdminAction3 extends ActionSupport implements SessionAware {
    private int id;
    private Map<String, Object> session;
    private Session hbnSession;
    private Docu d;
    private ArrayList<Docu> doculist =new ArrayList<Docu>();
    private String que;
    private InputStream input;
    private String filename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Docu getD() {
        return d;
    }

    public void setD(Docu d) {
        this.d = d;
    }

    public ArrayList<Docu> getDoculist() {
        return doculist;
    }

    public void setDoculist(ArrayList<Docu> doculist) {
        this.doculist = doculist;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public InputStream getInput() {
        return input;
    }

    public void setInput(InputStream input) {
        this.input = input;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Session getHbnSession() {
        return hbnSession;
    }

    public void setHbnSession(Session hbnSession) {
        this.hbnSession = hbnSession;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String  show() throws Exception{
        String hql=" from Docu order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        doculist = (ArrayList<Docu>) hbnSession.createQuery(hql).list();
        session.put("doculist", doculist);
        return "success";
    }
    public String query() throws Exception{

        String hql=" from Docu where docuname like :t order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        doculist = (ArrayList<Docu>) hbnSession.createQuery(hql).setParameter("t","%"+getQue()+"%").list();
        session.put("doculist", this.doculist);

        return "success";
    }
    public String delete() throws Exception{
        String hql ="delete Docu where id=?1";
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        hbnSession.createQuery(hql).setParameter(1,d.getId()).executeUpdate();
        hbnSession.getTransaction().commit();
        return "success";

    }
    public String download() throws Exception{

        input = new FileInputStream("D:\\"+getFilename());
        filename= URLEncoder.encode(getFilename(), "UTF-8");
        return "success";

    }
    public String upload() throws IOException, SQLException {
        File dest = new File("D:\\"+d.getDocuFileName());
        FileUtils.copyFile(d.getDocu(), dest);
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        String sql="insert into docu(docuname,docutype,date) values ('"+d.getDocuFileName()+"','"+d.getDocuContentType()+"','"+d.getDate()+"')";
        hbnSession.createSQLQuery(sql).executeUpdate();
        hbnSession.getTransaction().commit();
        return "success";
    }
}
