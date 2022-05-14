package ͨ���㷨��;

/**
 * @author lusir
 * @date 2022/5/8 - 19:07
 **/
public class pileSort_���� {

    public  static  void heapSort(int[] arr) {

        int heapSize=arr.length;
        if(arr==null||heapSize<2) return;
//        ���ѵĵ�һ�ַ�ʽ
        for (int i = 0; i < heapSize; i++) {
            heapInsert(arr,i);
        }
//        ���ѵĵڶ��ַ�ʽ ����
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
//            �Ƚ����Ӻ��Һ���˭Խ��
            int largest=left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
//            �͸��ڵ���бȽ�
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
