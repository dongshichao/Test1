package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Docu;
import pojo.Employee;

import java.util.ArrayList;
import java.util.Map;

public class AdminAction extends ActionSupport implements SessionAware {
    private Map<String, Object> session;
    private Employee e;
    private ArrayList<Employee> employeelist =new ArrayList<Employee>();
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

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<Employee> employeelist) {
        this.employeelist = employeelist;
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
        String hql = "from Employee ";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        employeelist = (ArrayList<Employee>) hbnSession.createQuery(hql).list();
        System.out.println(employeelist);
        session.put("employeelist",this.employeelist);
        hbnSession.getTransaction().commit();
        return "success";
    }
    public String query() throws Exception{

        String hql="from Employee  where name like :t order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        employeelist = (ArrayList<Employee>) hbnSession.createQuery(hql).setParameter("t","%"+getQue()+"%").list();
        session.put("employeelist", this.employeelist);
        return "success";
    }
    public String update() throws Exception{
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        hbnSession.update(e);
        hbnSession.getTransaction().commit();
        return "success";
    }
    public String add() throws Exception{
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        hbnSession.save(e);
        hbnSession.getTransaction().commit();
        return "success";
    }
    public String delete() throws Exception{
        String hql ="delete Employee where id=?1";
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        hbnSession.createQuery(hql).setParameter(1,e.getId()).executeUpdate();
        hbnSession.getTransaction().commit();
        return "success";

    }
}
