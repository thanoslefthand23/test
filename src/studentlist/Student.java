package studentlist;
/* 
   @author tailorha
   @author harsh tailor 30th may 2023
   testing
*/
public class Student {

 
    
    private String sname;
    private String sID;
    
    public Student(String sname, String sID){
        this.sname = sname;
        this.sID = sID;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
    
}
