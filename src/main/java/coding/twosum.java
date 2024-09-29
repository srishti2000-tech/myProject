package coding;

public class twosum {
	public static void main(String[] args) {
		int []nums= {1,3,5,6};
		int target =2;
		int i=0;
		System.out.println("i :"+i);
		int j=(nums.length)-1;
		System.out.println("j :"+j);
		while(j>=i) {
			System.out.println("in while");
			int mid = i+((j-i)/2);
			System.out.println(mid+"is getting calculated");
			if(nums[mid]==target) {
				System.out.println("check if mid it our position");
			   System.out.println(mid);
			   break;
			}
//			else if(j-i==1) {
//				if(nums[i]!=target&&nums[j]!=target&&nums[i]>target&&nums[j]<target) {
//					int an =i+1;
//					System.out.println(an);
//					break;
//				}
//			}
			else if(nums[mid]>target) {
				j=mid-1;
			}
			else i=mid+1;
		}
		System.out.println(i);
		}
	
        
         
    

    

   


}
