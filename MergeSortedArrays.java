class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a_mid_end = m-1;
        int a_end = nums1.length - 1;
        int b_end = n - 1;

        while(a_mid_end >= 0 && a_end >= 0 && b_end >= 0){
            System.out.println(nums1[a_mid_end]);
            System.out.println(nums1[a_end]);
            System.out.println(nums2[b_end]);
            System.out.println();
            if(nums1[a_mid_end] > nums2[b_end]){
                nums1[a_end--] = nums1[a_mid_end--];
            }
            else{
                nums1[a_end--] = nums2[b_end--];

            }
        }
        for(int i=b_end; i>=0 ; i--){
            nums1[a_end--] = nums2[i];
        }
    }
}