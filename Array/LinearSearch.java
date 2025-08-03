class LinearSearch{
    public static void main(String args[]){
        int arr[]={28,31,19,14,-3,-11};
        int target=19;
        int ans=Linear( arr,  target);
        System.out.println(ans);

   }
   static int Linear(int arr[],int target){
    if(arr.length==0){
        return -1;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target)
        {
            return i;
        }
       
    }
     return -1;
   }
}