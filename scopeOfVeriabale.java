/*
    // class label scope
class Algebra{
    int a = 10;
    int b = 5;
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
}


public class scopeOfVeriabale {
    public static void main(String[] args) {
        
    }
}
*/
class Algebra{
    int a = 10;
    int b = 5;
    int add(){
        int p = 100;
        int q = 20;
        return p + q;
    }
    int sub(){
        int p = 10;
        int q = 20;
        return p - q;
    }
}


public class scopeOfVeriabale {
    public static void main(String[] args) {
        
    }
}