class MedianOfTwoSortedArrays {

    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {3, 4};

        System.out.println(findMedianSortedArrays(a, b));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int num_of_ele = 0;
        if((m+n) % 2 == 0){
            num_of_ele = (m + n) / 2;
        }
        else{
            num_of_ele = (m + n + 1) / 2;
            System.out.println(num_of_ele);
        }
        if(m < n){
            int low = 0;
            int high = m-1;
            while(low < high){
                int mid = low + (high - low) / 2;
                int this_num_of_eles = mid + 1;
                int rem_eles = num_of_ele - this_num_of_eles;
                int index_in_other = rem_eles - 1;
                System.out.println(mid);
                System.out.println(this_num_of_eles);
                System.out.println(rem_eles);
                System.out.println(index_in_other);
                System.out.println(nums2[index_in_other] + " and " + nums1[mid+1]);
                if(mid < n-1 && nums2[index_in_other] > nums1[mid+1]){
                    System.out.println("Here on the");
                    low = mid + 1;
                }
                else if(index_in_other < m-1 && nums1[mid] > nums2[index_in_other+1]){
                    low = high - 1;
                }
                else{
                    if((m+n) % 2 != 0){
                        return (double)Math.max(nums1[mid], nums2[index_in_other]);
                    }
                    else{
                        int maxi = Math.max(nums1[mid], nums2[index_in_other]);
                        int secondmaxi = Math.max(nums1[mid+1], nums2[index_in_other+1]);
                        return (double)(maxi + secondmaxi) / (double)2;
                    }
                }
                System.out.println("END");
            }
            // if((m+n) % 2 != 0){
            //             return (double)Math.max(nums1[mid], nums2[index_in_other]);
            //         }
            //         else{
            //             int maxi = Math.max(nums1[mid], nums2[index_in_other]);
            //             int secondmaxi = Math.max(nums1[mid+1], nums2[index_in_other+1]);
            //             return (double)(maxi + secondmaxi) / (double)2;
            //         })

            

        }
        else{
            int low = 0;
            int high = n-1;
            while(low < high){
                int mid = low + (high - low) / 2;
                int this_num_of_eles = mid + 1;
                int rem_eles = num_of_ele - this_num_of_eles;
                int index_in_other = rem_eles - 1;
                System.out.println(mid);
                System.out.println(this_num_of_eles);
                System.out.println(rem_eles);
                System.out.println(index_in_other);
                System.out.println(nums1[index_in_other] + " and " + nums2[mid+1]);

                if(mid < n-1 && nums1[index_in_other] > nums2[mid+1]){
                    low = mid + 1;
                }
                else if(index_in_other < m-1 && nums2[mid] > nums1[index_in_other+1]){
                    low = high - 1;
                }
                else{
                    System.out.println("Hello");
                    if((m+n) % 2 != 0){
                        System.out.println((double)Math.max(nums2[mid], nums1[index_in_other]));
                        return (double)Math.max(nums2[mid], nums1[index_in_other]);
                    }
                    else{
                        int maxi = Math.max(nums2[mid], nums1[index_in_other]);
                        int secondmaxi = Math.max(nums2[mid+1], nums1[index_in_other+1]);
                        return (double)(maxi + secondmaxi) / (double)2;
                    }
                }
            }

            
        }
        return 0.0;
    }
}