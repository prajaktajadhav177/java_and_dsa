class BinarySearch{

public static int searchElement(int arr[],int key){

for(int i=0;i<arr.length;i++){
if(arr[i]==key){

return i;

}

}
return -1;
}

public static void main(String[] args){
int arr[]={8,10,4,7,3,10};
int key=3;
int result=searchElement(arr, key);
System.out.println("Element is at index:"+result);

}

}

