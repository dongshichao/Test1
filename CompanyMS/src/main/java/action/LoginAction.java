package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Employee;

import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {
    private Map<String, Object> session;
    private Employee e;
    private Session hbnSession;

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Session getHbnSession() {
        return hbnSession;
    }

    public void setHbnSession(Session hbnSession) {
        this.hbnSession = hbnSession;
    }

    @Override
    public String execute() throws Exception{
        String hql = "select limitation from Employee where name=?1 and password=?2 ";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        String limitation =(String) hbnSession.createQuery(hql).setParameter(1,this.getE().getName()).setParameter(2,this.getE().getPassword()).uniqueResult();
        hbnSession.getTransaction().commit();
        if (limitation == null){
            return "error";
        }else if (limitation.equals("admin")){
            session.put("name",e.getName());
            System.out.println("name is :"+this.e.getName());
            return "admin";
        }else {
            session.put("name",e.getName());
            System.out.println("name is :"+this.e.getName());
            return "user";
        }


    }
}
