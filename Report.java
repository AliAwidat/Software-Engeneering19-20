import java.time.Month;
import java.util.Date;
import java.util.Vector;
enum ReportType 
{ 
    aaa, bbb, ccc,ddd; 
} 
public class Report {

	private ReportType RT;
	private Date reportDate;
	private Vector <Store> stores;
	private Vector <Month> months;
		
	
	public Report(ReportType rt,Date rptDate,Vector <Store> stores,Vector <Month> months) {
		this.RT = rt;
		this.reportDate = rptDate;
		this.stores = stores;
		this.months = months;
	}


	public ReportType getRT() {
		return RT;
	}


	public void setRT(ReportType rT) {
		RT = rT;
	}


	public Date getReportDate() {
		return reportDate;
	}


	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}


	public Vector <Store> getStores() {
		return stores;
	}


	public void setStores(Vector <Store> stores) {
		this.stores = stores;
	}
}
