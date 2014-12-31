/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Account;
import DAL.HibernateUtil;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author LanceDH
 */
public class accountServices {
    public static ArrayList<DAL.Account> GetAllAccounts(){
        ArrayList<DAL.Account> list = new ArrayList<DAL.Account>();
        
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
             
        Query q = session.createQuery("from Account");
        list = (ArrayList<DAL.Account>) q.list();
        
        
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } catch(ExceptionInInitializerError e){
            System.err.println(e.getMessage());
        }
        finally{
            //session.close();
        }
        
        
        return list;
    }
    
    public static Account Login(String name, String pass) throws Exception{
        Account account = new Account();
        
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
             
        Query q = session.createQuery("from Account where name = '" + name + "' and password = '" + pass + "'");
        
        if(q.list().size() == 0){
            Exception ex = new Exception("Account name or password is incorrect");
            throw ex;
            
        }
            
        account = (Account)q.list().get(0);
        
        } catch (Exception e) {
            throw e;
        } catch(ExceptionInInitializerError e){
            System.err.println(e.getMessage());
        }
        finally{
            //session.close();
        }
        
        return account;
    }
}
