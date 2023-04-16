interface a<T>{
    T max(T z);
}
class P88InterfaceGenerics<T> implements a <T>{
    public T max(T z){
        return z;
    }

    public static void main(String[] args) {
        P88InetrfaceGenerics<Integer> obj  = new P88InterfaceGenerics();
        int abc = obj.max(33);
        System.out.println(abc);
    }
}