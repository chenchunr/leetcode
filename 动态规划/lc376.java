 //动态规划，up[i]代表以i结尾的最长上升摆动序列长度，down[i]代表以i结尾的最长下降摆动序列长度
 //
 public int wiggleMaxLength(int[] nums) {
         if(nums.length<2)return nums.length;
		 int up[]=new int[nums.length];
		 int down[]=new int[nums.length];
		 for(int i=1;i<nums.length;i++){
			 for(int j=0;j<i;j++){
				 if(nums[i]>nums[j]){
					 up[i]=Math.max(up[i],down[j]+1 );
				 }else if(nums[i]<nums[j]){
					 down[i]=Math.max(down[i], 1+up[j]);
				 }
			 }
		 }
		 
		 return 1+Math.max(up[nums.length-1], down[nums.length-1]);
	 }