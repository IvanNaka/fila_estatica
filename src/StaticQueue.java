public class StaticQueue<T>{

    private int spos = 0;
    private int rpos = 0;
    private T[] data;


    public StaticQueue(int size){
        this.data = (T[]) new Object[size];
    }

    public void add(T dado) throws Exception {
        if (!isFull() && this.rpos <= this.data.length){
            this.data[this.spos] = dado;
            this.spos += 1;
        }else{
            throw new Exception("Fila cheia!");
        }
    }

    public T remove (){
        var removedItem = this.data[rpos];
        var newData = (T[]) new Object[this.data.length];
        for (int i = 0; i <= this.data.length; i++ ){
            if (rpos != i){
                try{
                    newData[i] = this.data[i];
                }catch (IndexOutOfBoundsException e){
                    continue;
                }
            }
        }
        this.data = newData;
        this.rpos += 1;
        return removedItem;
    }

    public void clear(){
        this.data = (T[]) new Object[this.data.length];
        this.rpos = 0;
        this.spos = 0;
    }

    public boolean isFull(){
        for (int i = 0; i <= this.data.length; i++ ){
            try{
                var item = this.data[i];
            }catch (IndexOutOfBoundsException e){
                return false;
            }
        }
        return true;
    }
    public boolean isEmpty(){
        for (int i = 0; i <= this.data.length; i++ ){
            try{
                var item = this.data[i];
                return false;
            }catch (IndexOutOfBoundsException ignored){}
        }
        return true;
    }
}