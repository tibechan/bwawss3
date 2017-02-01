package s3example;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;


public class AWS_S3_Service {
	
	List<S3Buckets> bucketList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public List<S3Buckets> listBuckets(String accessKey, String secretKey) {
		
		bucketList = new ArrayList<S3Buckets>();
		
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
		AmazonS3 s3Client = new AmazonS3Client(awsCreds);
		
		
		List<Bucket> buckets = s3Client.listBuckets();
		
		for (Bucket bucket : buckets) {
			S3Buckets s3Bucket = new S3Buckets(bucket.getName(), bucket.getCreationDate(), bucket.getOwner().getDisplayName(), bucket.getOwner().getId());
			bucketList.add(s3Bucket);
		}
		
		return bucketList;
	}


	public List<S3Buckets> getBucketList() {
		return bucketList;
	}


	public void setBucketList(List<S3Buckets> bucketList) {
		this.bucketList = bucketList;
	}
	
	
}
