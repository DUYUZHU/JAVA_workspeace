package week2;

public class SqListTest {
    public static void main(String[] args) {
        Integer[] a=new Integer[10];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
        SqListClass<Integer> k=new SqListClass<Integer>();
        k.CreateList(a);
        System.out.println(k);
        k.Add(1);
        System.out.println(k);
        k.Delete(2);
        System.out.println(k);
        k.swap(1,2);
        System.out.println(k);
        k.Insert(4,5);
        System.out.println(k);
        k.SetElem(0,1);
        System.out.println(k);
        System.out.println(k.GetElem(2));
        System.out.println(k.GetNo(3));
        System.out.println(k.size());
    }
}
