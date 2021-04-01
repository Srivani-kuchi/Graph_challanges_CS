boolean newRoadSystem(boolean[][] roadRegister) {
    for(int i = 0; i < roadRegister.length; i++){
        int outs = 0;
        for(int j = 0; j < roadRegister[i].length; j++){
            if(roadRegister[i][j]){
            outs++;
        }
        }
        int ins = 0;
        for(int j = 0; j < roadRegister[i].length; j++){
            if(roadRegister[j][i]){
                ins++;
            }
        }
            
            if(ins != outs){
                return false;
            }
    }
    return true;

}
