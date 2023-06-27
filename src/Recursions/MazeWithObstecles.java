package Recursions;
import java.util.*;

public class MazeWithObstecles {
    public static void main(String[] args) {
        int[][] nums={{0,1,0},{0,1,0},{0,0,0}};
        System.out.println(pathObstecles(nums,"",0,0));
    }
    static ArrayList<String> pathObstecles(int[][] arr,String p,int r, int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            ArrayList<String> list=new ArrayList();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList();
        if(arr[r][c]==1)return new ArrayList();
        if(r<arr.length-1) ans.addAll(pathObstecles(arr,p+'D',r+1,c));
        if(c<arr[0].length-1) ans.addAll(pathObstecles(arr,p+'R',r,c+1));
        return ans;
    }
}
