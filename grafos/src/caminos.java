public class caminos {
    //metodo para determinar todo los caminos floyd
    public  String algoritmofloyd(long [][]mady){
        int vertice=mady.length;
        long matrizadyacencia[][]=mady;
        String caminos[][]= new String[vertice][vertice];
        String caminosAuxiliares[][]= new String[vertice][vertice];
        String caminorecorrido="",cadena="",caminitos="";
        int i,j,k;
        float temporal1,temporal2,temporal3,temporal4,minimo;

        for (i=0;i<vertice;i++){
            for (j=0;j<vertice;j++){
                caminos[i][j]="";
                caminosAuxiliares[i][j]="";
            }
        }
        for (k=0;k<vertice;k++){
            for (i=0;i<vertice;i++){
                for (j=0;j<vertice;j++){
                    temporal1=matrizadyacencia[i][j];
                    temporal2=matrizadyacencia[i][k];
                    temporal3=matrizadyacencia[k][j];
                    temporal4=temporal2+temporal3;
//encontrando al minimo
                    minimo=Math.min(temporal1,temporal4);
                    if (temporal1!=temporal4){
                        if (minimo==temporal4){
                            caminorecorrido="";
                            caminosAuxiliares[i][j]=k+"";
                            caminos[i][j]=caminosR(i,k,caminosAuxiliares,caminorecorrido)+ (k+1);
                        }
                    }
                    matrizadyacencia[i][j]=(long)  minimo;

                }
            }
        }
        //agregando el camino a cadena
        for (i=0;i<vertice;i++) {
            for (j = 0; j < vertice; j++) {
                cadena=cadena+""+matrizadyacencia[i][j]+"";

            }
            cadena=cadena +"\n";
        }
        ////////////////////
        for (i=0;i<vertice;i++) {
            for (j = 0; j < vertice; j++) {
                if (matrizadyacencia[i][j]!=1000000000){
                    if (i!=j){
                        if (caminos[i][j].equals("")){
                            caminitos+="De {"+(i+1)+"--->"+(j+1)+") irse por...("+(i+1)+", "+(j+1)+", "+(j+1)+")\n";

                        }else {
                            caminitos+="De {"+(i+1)+"--->"+(j+1)+") irse por...("+(i+1)+", "+caminos[i][j]+", "+(j+1)+")\n";
                        }
                    }
                }
            }
        }
        return "la matriz de caminos mas corteos entre los diferentes vertes es \n"+cadena
                + "\n los diferentes caminos mas cortos entre vertices son\n"+ caminitos;
    }
    public String caminosR(int i, int k, String[][] caminosAuxiliares,String cacaminosRecorridos){
        if (caminosAuxiliares[i][k].equals("")){
            return "";
        }else {
            //recursividad al millon
            cacaminosRecorridos +=caminosR(i,Integer.parseInt
                    (caminosAuxiliares[i][k].toString()),caminosAuxiliares,cacaminosRecorridos)
                    +(Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+", ";
            return cacaminosRecorridos;
        }
    }
}
