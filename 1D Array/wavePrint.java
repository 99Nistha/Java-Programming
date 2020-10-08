public class wavePrint {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        wave(arr);
    }
    public static void wave(int[][]arr){
        for(int i=0;i<arr[0].length;i++){
            if(i%2==0){
                for(int j=0;j<arr.length;j++) System.out.println(arr[j][i]+" ");
            }else for(int j=arr.length-1; j>=0;j--) System.out.println(arr[j][i]+" ");
        }
    }
}
