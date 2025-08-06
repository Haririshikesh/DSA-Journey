package com.esha.dsa.arrays_and_hashing.valid_sudoko;

import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public boolean isValidSudoku(char[][] b) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                char ch = b[i][j];
                if(ch!='.'){
                    if(!set.add("ch-"+ch+":r-"+i)||!set.add("ch-"+ch+":c-"+j)||!set.add("ch-"+ch+":r,c-"+i/3+","+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}