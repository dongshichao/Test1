package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import pojo.Board;

import java.util.ArrayList;
import java.util.Map;

public class UserAction2 extends ActionSupport implements SessionAware {
    private Map<String, Object> session;
    private Board b;
    private ArrayList<Board> boardlist =new ArrayList<Board>();
    private Session hbnSession;
    private String que;

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public Session getHbnSession() {
        return hbnSession;
    }

    public void setHbnSession(Session hbnSession) {
        this.hbnSession = hbnSession;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Board getB() {
        return b;
    }

    public void setB(Board b) {
        this.b = b;
    }

    public ArrayList<Board> getBoardlist() {
        return boardlist;
    }

    public void setBoardlist(ArrayList<Board> boardlist) {
        this.boardlist = boardlist;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
    public String show() throws Exception{
        String hql="from Board order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        boardlist = (ArrayList<Board>) hbnSession.createQuery(hql).list();
        session.put("boardlist", boardlist);
        return "success";
    }
    public String query() throws Exception{

        String hql=" from Board where title like :t order by id desc";
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        boardlist = (ArrayList<Board>) hbnSession.createQuery(hql).setParameter("t","%"+getQue()+"%").list();
        session.put("boardlist", boardlist);

        return "success";
    }
}
