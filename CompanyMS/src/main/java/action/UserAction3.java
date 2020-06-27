package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Board;
import pojo.Docu;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

public class UserAction3 extends ActionSupport implements SessionAware {
    private int id;
    private Map<String, Object> session;
    private Docu d;
    private ArrayList<Docu> doculist =new ArrayList<Docu>();
    private String que;
    private InputStream input;
    private String filename;
    private Session hbnSession;

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

        String hql="from Docu  where docuname like :t order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        doculist = (ArrayList<Docu>) hbnSession.createQuery(hql).setParameter("t","%"+getQue()+"%").list();
        session.put("doculist", doculist);
        return "success";
    }
}
