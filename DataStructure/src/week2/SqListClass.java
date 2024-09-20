package week2;

public class SqListClass <E>{
    final int initcapacity = 10;
    public E[]data;
    public int size;
    private int capacity;
    public SqListClass(){
        data =(E[]) new  Object[initcapacity];
        capacity = initcapacity;
        size=0;
    }
    private void updatecapacity(int newcapacity){
        E[] newdata = (E[]) new Object[newcapacity];
        for (int i=0;i<size;i++)
            newdata[i]=data[i];
        capacity=newcapacity;
        data=newdata;
    }
    public void CreateList(E[] a){
        size =0;
        for (int i=0;i<a.length;i++){
            if (size==capacity)
                updatecapacity(2*size);
            data[size]=a[i];
            size++;
        }
    }
    //将元素e添加到线性表的末尾
    public void Add(E e){
        if (size==capacity)
            updatecapacity(2*size);
        data[size]=e;
        size++;
    }
    //求线性表的长度
    public int size(){
        return size;
    }
    //设置线性表的长度
    public  void Setsize(int nlen){
        if (nlen<0||nlen>size)
            throw new IllegalArgumentException("设置长度：n不在有效范围内");
        size=nlen;
    }
    //求线性表中序号为i的元素值
    public E GetElem(int i){
        if (i<0||i>size-1)
            throw new IllegalArgumentException("查找：位置i不在有效范围内");
        return (E) data[i];
    }
    //设置线性表中序号为i的元素值
    public void SetElem(int i,E e){
        if (i<0||i>size-1)
            throw new IllegalArgumentException("查找：位置i不在有效范围内");
        data[i]=e;
    }
    //求线性表中第一个值为e的元素的序号
    public int GetNo(E e){
        int i =0;
        while (i<size&&!data[i].equals(e))
            i++;
        if (i>=size)
            return -1;
        else
            return 1;
    }
    //将线性表中的序号为i和序号和j的元素交换
    public void  swap(int i,int j){
        E tmp=data[i];
        data[i]=data[j];
        data[j]=tmp;
    }
    //在线性表中插入e作为第i个元素
    public void Insert(int i,E e){
        if (i<0||i>size)
            throw new IllegalArgumentException("插入：位置i不在有效范围内");
        if (size==capacity)
            updatecapacity(2*size);
        for (int j=size;j>i;j--)
            data[j]=data[j-1];
        data[i]=e;
        size++;
    }
    //删除
    public void Delete(int i){
        if (i<0||i>size-1)
            throw new IllegalArgumentException("插入：位置i不在有效范围内");
        for (int j=i;j<size-1;j++)
            data[j]=data[j+1];
        size--;
        if (capacity>initcapacity&&size==capacity/4)
            updatecapacity(capacity/2);
    }
    //转换为字符串
    public String toString(){
        String ans ="";
        for (int i =0;i<size;i++)
            ans+=data[i].toString()+"";
        return ans;
    }

}
