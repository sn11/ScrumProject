
public class Project {

	 public String name;
	    public Owner owner;
	    public ScrumMaster sm;
	    public TeamMembers tm;
	    
	    public ProductBacklog pbacklock;
	    
	    public Sprints sbacklock;

	    public void Project(String n, Owner o, ScrumMaster s, TeamMembers t, ProductBacklog bl, Sprints sp) {
	        name = n;
	        owner = o;
	        sm = s;
	        tm = t;
	        pbacklock = bl;
	        sbacklock = sp;
	    }
	    
	    public String getProjectName(){
	        return name;
	    }
}
