package s3example;
import java.io.Serializable;
import java.util.Date;




public class S3Buckets implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private members
	private String BucketName = null;
	private Date creationDate = null;
	private String ownerDisplayName = null;
	private String ownerid = null;
	
	 /**
     * Constructor.
     */
	public S3Buckets() {}
	
	
	

	 public S3Buckets(String bucketName, Date creationDate,
			String ownerDisplayName, String ownerid) {	
		BucketName = bucketName;
		this.creationDate = creationDate;
		this.ownerDisplayName = ownerDisplayName;
		this.ownerid = ownerid;
	}




	/**
     * Constructor.
     * @param name - customer Last name   
     */
	public S3Buckets(String name) {		
		this.BucketName = name;
	}

	@Override
	public String toString() {
		return "S3Buckets [BucketName=" + BucketName + "]";
	}

	// bucketName accessor method
	public String getBucketName() {
		return BucketName;
	}		
	 	
	public void setBucketName(String bucketName) {
			this.BucketName = bucketName;
	}




	public Date getCreationDate() {
		return creationDate;
	}




	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}




	public String getOwnerDisplayName() {
		return ownerDisplayName;
	}




	public void setOwnerDisplayName(String ownerDisplayName) {
		this.ownerDisplayName = ownerDisplayName;
	}




	public String getOwnerid() {
		return ownerid;
	}




	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}		
	
	
	
}
