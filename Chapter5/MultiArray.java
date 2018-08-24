class MultiArray {
    public static void main (String args[]){
        int arr1[][] = new int[3][3];
        int arr2[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int arr3[][] = new int[3][];
        arr3[0] = new int[3];
        arr3[1] = new int[1];
        arr3[2] = new int[2];

        fillArr(arr1);
        fillArr(arr3);

        System.out.println("arr1: ");
        printArr(arr1);
        System.out.println("\narr2:");
        printArr(arr2);
        System.out.println("\narr3:");
        printArr(arr3);
    }

    static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fillArr(int[][] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = ++count;
            }
        }
    }
}