package pratikyapma;

public class MyClass {


	int x=3;
    int y=5;
    
    MyClass (){
        x+=1;
        System.out.println("1.= " +x);  //3+1=4
    }
    
    MyClass (int i){
        this();                       // 1. constructoru cagirir.x=4
        this.y =i;                    // y=3 olur
        x+=y;                         // x=4+3=7
        System.out.println("2.= " +x);  //
    }
    
    MyClass (int i, int i2){          // (4,3)
        this(3);                      // 2. constructori cagirir x=7
        this.x-=4;                    // x=7-4=3
        System.out.println("3.= " +x);
    }
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass(0);
       MyClass mc3 = new MyClass(4,3); 

    }
}
