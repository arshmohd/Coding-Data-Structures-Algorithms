class DynamicArray{
    /**An array which can grow at runtime
     * It bassicall contains extend() method which decides when to GROW
     * and, reduce() methos which decides when to Shrink
     * these two method makes a normal array to dynanic array
     *  */ 

     int [] ar; // the array
     int size;// size of the array
     int top;// pointing the 0 th index initially , but it updated to next empty cell
     
    public DynamicArray(){
        // CONSTRUCTOR
        ar=new int [1];// Initially the ar has size 1, It update its size at runtime when items are inserted
        size=1;// initially size is 1
        top=0; // top initially pointing the 0th index
    }
    public void extend(){
        int temp[]=null;// creating Temporary array
        if(top==size){
            // when top and size both have same value, array is full, then
            temp=new int[size*2];// create temmp array with Double size the previous size was
            // then just copy all elements from ar array to temp array
            for(int i=0;i<size;i++){
                temp[i]=ar[i];
            }
            // then make temp as ar
            ar=temp;// the real temp will garbage collected
            size=size*2;// update the size..

        }
    }
    public void add(int item){
        extend();// calling extend method to decide when to double the size.
        ar[top]=item;// item will added at where top pointing
        top++;// then after adding top will pointing next cell
    }
    public void addAt(int index, int item){
        //adding at specified index
        extend();// calling extend method to decide when to double the size.
        if(size==1){
            ar[top]=item;
            top++;
        }
        else
        {for(int i=top-1;i>=index;i--){
            ar[i+1]=ar[i];// ar[i] will placed at ar[i+1]
        }
        ar[index]=item;
        top++;
    }
    }

    public void reduce(){
        int temp[];
        if(top==size/2){
            // when the array is half fill, then
            temp=new int [size/2];
            for(int i=0;i<top;i++){
                temp[i]=ar[i];
            }
             // then make temp as ar
            ar=temp;// the real temp will garbage collected
            size=size/2;// update the size..
        }
    }
    public void remove(){
        // remove the element which is pointed bt top
        if(top>0){
            reduce();// calling reduce method to decide when shrink the array..
            // array is not empty, then
            ar[top-1]=0;// make the last element 0
            top--;// reduce the top pointer, which now will point the deleteted index
        }
    }
    public void removeAt(int index){
        // remove the element which is specified by index
        reduce();// calling reduce method to decide when shrink the array..
        for(int i=index;i<top-1;i++){
            ar[i]=ar[i+1];// ar[i+1] will places at ar[i]
        }
        ar[top-1]=0;
        top--;
    }
}