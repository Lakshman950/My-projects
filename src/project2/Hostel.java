package project2;

public class Hostel {

	private String hostelname;
	private String hosteltype;
	private String hostelLocation;
	private float hostelrating;
	
	public Hostel(String hostelname, String hosteltype, String hostelLocation, float hostelrating) {
		super();
		this.hostelname = hostelname;
		this.hosteltype = hosteltype;
		this.hostelLocation = hostelLocation;
		this.hostelrating = hostelrating;
	}
	public String getHostelname() {
		return hostelname;
	}
	public void setHostelname(String hostelname) {
		this.hostelname = hostelname;
	}
	public String getHosteltype() {
		return hosteltype;
	}
	public void setHosteltype(String hosteltype) {
		this.hosteltype = hosteltype;
	}
	public String getHostelLocation() {
		return hostelLocation;
	}
	public void setHostelLocation(String hostelLocation) {
		this.hostelLocation = hostelLocation;
	}
	public double getHostelrating() {
		return hostelrating;
	}
	public void setHostelrating(float hostelrating) {
		this.hostelrating = hostelrating;
	}
	@Override
	public String toString() {
		return "Hostel [hostelname=" + hostelname + ", hosteltype=" + hosteltype + ", hostelLocation=" + hostelLocation
				+ ", hostelrating=" + hostelrating + "]";
	}
	
	
}
