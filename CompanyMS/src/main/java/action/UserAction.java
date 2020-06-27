package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Employee;

import java.util.ArrayList;
import java.util.Map;

public class UserAction extends ActionSupport implements SessionAware {
    private Map<String, Object> session;
    private Employee e;
    private ArrayList<Employee> employeelist =new ArrayList<Employee>();
    private Session hbnSession;



    public Session getHbnSession() {
        return hbnSession;
    }

    public void setHbnSession(Session hbnSession) {
        this.hbnSession = hbnSession;
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

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public String show() throws Exception{
        String hql = " from Employee where name =?1";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        employeelist = (ArrayList<Employee>) hbnSession.createQuery(hql).setParameter(1,session.get("name")).list();
        System.out.println(employeelist);
        session.put("employeelist",this.employeelist);
        hbnSession.getTransaction().commit();
        return "success";
    }
    public String update() throws Exception{
        Session hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        hbnSession.update(e);
        hbnSession.getTransaction().commit();
        return "success";
    }

}
