import java.util.*;

public class assignment {
    public static void main(String[] args) {
        int[] blockSize = {100,100,100,500,600};
        int[] processSize = {212,417,112,426};

        int processes = processSize.length;
        int blocks = blockSize.length;
        Map<Integer,Integer> indexes = new HashMap<>();
        int index=0;

        for(int i=0; i<processes; i++){
            int currentBlockSize = 0;
          //  System.out.println(processSize[i]);
            currentBlockSize = blockSize[0] - processSize[i];
            for(int j=1; j<blocks; j++){
                if(blockSize[j] - processSize[i] > currentBlockSize){
                    currentBlockSize = blockSize[j] - processSize[i];
                    index = j;
                  //  System.out.println("fdsfsd:"+currentBlockSize +" " +index);
                }
            }
            if(currentBlockSize > 0) {
                //System.out.println("Max= " + currentBlockSize + "Index:" + index);
                blockSize[index] = currentBlockSize;
                indexes.put(processSize[i],index+1);
            }
        }
        //OutPut
        System.out.println("ProcessNo"+"    "+"ProcessSize"+"    "+"Block No.");
        for(int i=0; i<processes; i++){
            System.out.print((i+1)+"            ");
            if(indexes.containsKey(processSize[i])){
                System.out.println(processSize[i]+"             "+indexes.get(processSize[i]));
            }
            else{
                System.out.println(processSize[i]+"             "+"Not Allocated");
            }
        }
        /*
        for (int a:blockSize) {
            System.out.print(a+" ");
        }
        for(int a : allocated){
            System.out.print(a+ " ");
        }
        */

    }
}
