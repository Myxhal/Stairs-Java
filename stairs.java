public class stairs{
    public static void main(String[] args){
        int d =  5;//Integer.parseInt(args[0]);
        int bricks =10;// Integer.parseInt(args[1]);
        char[][] arr = new char[d][d];
        int x = d-1;
        for(int j = 0; j<= d-1; j++){
            for(int i = d-1; i >= x; i--){
                if(bricks > 0){
                    arr[i][j] = 'X';
                    bricks--;
                 }
                 else{arr[i][j] = ' ';}
            }
            x--;
        }
        for(int i = 0; i < d; i++){
            for(int k = 0; k < d; k ++){
                if(Character.compare(arr[i][k], 'X') != 0){
                    arr[i][k] = ' ';
                }
            }
        }
        for(int i = 0; i < d; i++){
            for(int j = 0; j < d; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Bricks remaining:" + bricks);
    }
}
