package 通用算法包;

/**
 * @author lusir
 * @date 2022/5/8 - 19:07
 **/
public class pileSort_左神 {

    public  static  void heapSort(int[] arr) {

        int heapSize=arr.length;
        if(arr==null||heapSize<2) return;
//        建堆的第一种方式
        for (int i = 0; i < heapSize; i++) {
            heapInsert(arr,i);
        }
//        建堆的第二种方式 更快
        for (int i=heapSize/2;i>=0;i--) {
            heapIfy(arr,i,heapSize);
        }
        swap(arr,0,--heapSize);
        while (heapSize>0) {
            heapIfy(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }


    public static void heapInsert(int[]arr,int index) {
        while (arr[index]>arr[(index-1)/2]) {
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;
        }
    }

    public static void heapIfy(int[] arr,int index,int heapSize) {
        int left=2*index+1;
        while (left<heapSize) {
//            比较左孩子和右孩子谁越大
            int largest=left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
//            和父节点进行比较
            largest=arr[largest]>arr[index]?largest:index;
            if (largest!=index) {
                swap(arr,index,largest);
                index=largest;
                left=index*2+1;
            }
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
