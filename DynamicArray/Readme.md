public void addAt(int index, int item){
        //adding at specified index
        extend();// calling extend method to decide when to double the size.
        if(size==1){
            ar[top]=item;
            top++;
        }
        else
        {for(int i=top-1;i>=index;i--){
        //Shift all elements 
        <img src="./DynamicArray/Images/ezgif.com-gif-maker.gif">
            ar[i+1]=ar[i];// ar[i] will placed at ar[i+1]
        }
        ar[index]=item;
        top++;
    }
