package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Docu;
import pojo.Employee;
import pojo.Salary;

import java.util.ArrayList;
import java.util.Map;

public class UserAction4 extends ActionSupport implements SessionAware {
    private Map<String, Object> session;
    private Salary s;
    private ArrayList<Salary> salarylist = new ArrayList <Salary>();
    private Session hbnSession;
    private String que;

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Salary getS() {
        return s;
    }

    public void setS(Salary s) {
        this.s = s;
    }

    public ArrayList<Salary> getSalarylist() {
        return salarylist;
    }

    public void setSalarylist(ArrayList<Salary> salarylist) {
        this.salarylist = salarylist;
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
    public String show() throws Exception{
        String hql = " from Salary where name = ?1";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        salarylist = (ArrayList<Salary>) hbnSession.createQuery(hql).setParameter(1,session.get("name")).list();
        System.out.println(salarylist);
        session.put("salarylist",this.salarylist);
        hbnSession.getTransaction().commit();
        return "success";
    }
    public String query() throws Exception{

        String hql="from Salary  where name like :t order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        salarylist = (ArrayList<Salary>) hbnSession.createQuery(hql).setParameter("t","%"+getQue()+"%").list();
        session.put("salarylist", this.salarylist);
        return "success";
    }

}
