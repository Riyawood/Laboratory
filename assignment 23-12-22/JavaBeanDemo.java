package oops;
class College{
	private int collegeId;
    private String collegeName;
    public College()
    {
    	super();
    }
    public College(int collegeId, String collegeName)
    {
    	this.collegeId=collegeId;
    	this.collegeName=collegeName;
    }
    public int getCollegeId() {
		return collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}
	//setter

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}
}
public class JavaBeanDemo 
{
	public static void main(String[] args) 
	{
			College college1 = new College();
			college1.setCollegeId(101);
			college1.setCollegeName("LPU");
			System.out.println(college1);

			System.out.println("College Name : "+college1.getCollegeName());
			System.out.println("College Id : "+college1.getCollegeId());

			College college2 = new College(102,"BIT");
			System.out.println(college2);
			
			System.out.println("College Name : "+college2.getCollegeName());
			System.out.println("College Id : "+college2.getCollegeId());
         }
}
