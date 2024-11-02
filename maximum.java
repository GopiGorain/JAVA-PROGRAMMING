class Maximum
  {
      public static void main(String args[])
    {
        int arr[] = {4,2,1,5,7};
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n;i++)
          {
            if(arr[i] > max) max = arr[i];
          }
      System.out.println(max);
    }
  }
